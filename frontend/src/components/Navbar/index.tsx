import {ReactComponent as GithubIcon} from 'assets/img/github.svg'
import  './styles.css';

function Navbar(){

    return (
        <header>
            <nav className="container">
                <div className="dspeixe-nav-content">
                    <h1>DSPeixe</h1>
                        <a href="https://github.com/Thyagoj7">
                        <div className="dspeixe-contact-container">
                                <GithubIcon />
                                <p className="dspeixe-contact-link">/devsuperior</p>
                             </div>
                         </a>
                    </div>
                </nav>
            </header>
    );
}

export default Navbar;