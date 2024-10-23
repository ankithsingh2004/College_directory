import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Login from './components/Login/login'

function App() {
  return <><h1>WELCOME</h1><BrowserRouter>
    <Routes>
      <Route path="/login" element={<Login />}></Route>
    </Routes>
  </BrowserRouter></>

}

export default App;
