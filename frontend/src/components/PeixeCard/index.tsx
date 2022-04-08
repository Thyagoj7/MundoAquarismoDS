import MovieScore from "components/MovieStars/MovieScore";
import { Link } from "react-router-dom";
import { Peixe } from "types/peixe"


type Props = {
   peixe: Peixe;
}
function PeixeCard({ peixe } : Props)  {
// <MovieScore count={movie.count} score={peixe.score}/>
   

    return(
        
        <div>
        <img className="dspeixe-peixe-card-image" src={peixe.image} alt={peixe.Nome} />
        <div className="dspeixe-card-bottom-container">
            <h3>{peixe.Nome}</h3>
           
            <Link to={`/form/${peixe.id}`}>
                <div className="btn btn-primary dspeixe-btn">Avaliar</div>
            </Link>
        </div>
    </div> 


    );
}

export default PeixeCard;