import axios from "axios";
import PeixeCard from "components/PeixeCard";
import Pagination from "components/Pagination";
import { BASE_URL } from "utils/requests";
import { PeixePage } from "types/peixe";
import { useState } from "react";
import { useEffect } from "react";

function Listing(){

    const [pageNumber, setPageNumber] = useState(0);       /*Desta forma o pageNumber é o component que esta sendo observado pelo useEffect*/

    const [page, setPage] = useState<PeixePage>({           /*page é o objeto, setPage é a função que vai alterar o objeto*/
        content: [],
        last: true,
        totalPages: 0,
        totalElements: 0,
        size: 12,
        number: 0,
        first: true,
        numberOfElements: 0,
        empty: true,
    });
    useEffect(() => {
        axios.get(`${BASE_URL}/profile/elementoPeixes$}`)    //${pageNumber
        .then(response => {
            const data = response.data as PeixePage;
            setPage(data);
        });
    
    }, [pageNumber]);  //Assim que o pagenumber alterar a funcao sera carregada

    const handlePageChange = (newPageNumber : number) => {
        setPageNumber(newPageNumber);
    }
   

    
   
    return (

        <>
            
            <Pagination page={page} onChange={handlePageChange} />

            <div className="container">
                <div className="row">
                    {page.content.map(peixe => (  //para cada item do meu array eu vou executar alguma coisa no corpo da função, vai fciar assim para cada peixe ele executara a função 
                         <div key={peixe.id} className="col-sm-6 col-lg-4 col-xl-3 mb-3">
                         <PeixeCard peixe={peixe} />
                     </div>
                   
                    )
                    )}
                        

                   
                    
                </div>
            </div>

            

        </>
    );
}

export default Listing;