import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import './pages.css';

const HomePage = () => {
    const [callID, setCallID] = useState('');

    const createCall = () => {
        console.log("Create Call" + callID);
        useNavigate('/call/' + callID);
    }
    const connectCall = () => {
        console.log("Connect Call" + callID);
    }

    return (
        <div>
            <section className='homeSection'>
                <input type="text" onChange={setCallID} className="idInput" placeholder="Enter Call ID"/>
                <section className='mainButtonsSection'>
                    <button className="createBt" onClick={createCall()}>Create Call</button>
                    <button className="connectBt" onClick={connectCall()}>Connect Call</button>
                </section>
            </section>
        </div>
    );
}

export default HomePage;