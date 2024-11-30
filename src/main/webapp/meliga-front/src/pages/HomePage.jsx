import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { connectCall, createCall} from '../websocket';
import './pages.css';

const HomePage = () => {
    const [callID, setCallID] = useState('');

    const handleCreateCall = () => {
        createCall(callID);
    }
    const handleConnectCall = () => {
        connectCall(callID);
    }

    return (
        <div>
            <section className='homeSection'>
                <input type="text" onChange={setCallID} className="idInput" placeholder="Enter Call ID"/>
                <section className='mainButtonsSection'>
                    <button className="createBt" onClick={handleCreateCall()}>Create Call</button>
                    <button className="connectBt" onClick={handleConnectCall()}>Connect Call</button>
                </section>
            </section>
        </div>
    );
}

export default HomePage;