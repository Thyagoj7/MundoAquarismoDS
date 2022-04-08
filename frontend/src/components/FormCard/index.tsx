import axios, { AxiosRequestConfig } from 'axios';
import { useEffect, useState } from 'react';
import { Link, useNavigate } from 'react-router-dom';
import { Peixe } from 'types/peixe';
import { BASE_URL } from 'utils/requests';
/*import { validateEmail } from 'utils/validate';*/
import './styles.css';


type Props = {
    peixeId : string;
}
function FormCard({ peixeId  } : Props) {

    const navigate = useNavigate();

    const [peixe, setPeixe] = useState<Peixe>();

    useEffect(() => {
        axios.get(`${BASE_URL}/peixes/${peixeId}`)
        .then(response => {
            setPeixe(response.data);
        });
    })

    const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {

        event.preventDefault();

        const email = (event.target as any).email.value;

        const score = (event.target as any).score.value;

       /* if (!validateEmail(email)) {
            return;
        }*/

        const config: AxiosRequestConfig = {
            baseURL: BASE_URL,
            method: 'PUT',
            url: '/scores',
            data: {
                email: email,
                movieId: peixeId,
                score: score
            }
        }
      
        axios(config).then(response => {
            navigate("/");

        });
        
        
    }
 
    return (
        <div className="dspeixe-form-container">
    <img className="dspeixe-peixe-card-image" src={peixe?.image} alt={peixe?.Nome} />
    <div className="dspeixe-card-bottom-container">
        <h3>{peixe?.Nome}</h3>
        <form className="dspeixe-form" onSubmit={handleSubmit}>
            <div className="form-group dspeixe-form-group">
                <label htmlFor="email">Informe seu email</label>
                <input type="email" className="form-control" id="email" />
            </div>
           <div className="form-group dspeixe-form-group">
                <label htmlFor="score">Informe sua avaliação</label>
                <select className="form-control" id="score">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                </select>
            </div>
            <div className="dspeixe-form-btn-container">
                <button type="submit" className="btn btn-primary dspeixe-btn">Salvar</button>
            </div>
        </form >
        <Link to="/">
            <button className="btn btn-primary dspeixe-btn mt-3">Cancelar</button>
        </Link>
    </div >
</div >
    );
}

export default FormCard;