import React, { useState, useEffect } from 'react';
import logo from './logo.svg';
import './App.css';
import axios from "axios";

function App() {

  const [helloMessage, setHelloMessage] = useState("Loading...");

  useEffect(() => {
    axios.get('/hello')
      .then(response => setHelloMessage(response.data))
      .catch(error => setHelloMessage("Error: " + error));
  }, []);

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          <p>Edit <code>src/App.js</code> and save to reload.</p>
          <p>{helloMessage}</p>
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
