import {BrowserRouter as Router, Route, Routes} from 'react-router-dom'
import HomePage from './pages/HomePage'
import CallPage from './pages/CallPage'
import LoginPage from './pages/LoginPage'

import './index.css'

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<HomePage />} />
        <Route path="/home" element={<HomePage />} />
        <Route path="/login" element={<LoginPage />} />
        <Route path="/call" element={<CallPage />} />
      </Routes>
    </Router>
  )
}

export default App
