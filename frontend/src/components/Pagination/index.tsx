import{ ReactComponent as Arrow} from 'assets/img/arrow.svg';
import { PeixePage } from 'types/peixe';
import './styles.css';


type Props = {
    page: PeixePage;
    onChange: Function;
}
function Pagination( { page, onChange } : Props) {

   
    return (
<div className="dspeixe-pagination-container">
    <div className="dspeixe-pagination-box">
        <button className="dspeixe-pagination-button" disabled={page.first} onClick={() => onChange(page.number - 1)} >
            <Arrow />
        </button>
        <p>{`${page.number+1} de ${page.totalPages}`}</p>
        <button className="dspeixe-pagination-button" disabled={page.last} onClick={() => onChange(page.number + 1)} >
            <Arrow className="dspeixe-flip-horizontal" />
        </button>
    </div>
</div>
    );
}

export default Pagination;