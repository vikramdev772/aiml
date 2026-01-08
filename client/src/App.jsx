import React from "react";
import "./App.css";
import { BrowserRouter, Routes ,Route} from "react-router-dom";
import L from "./ui/L";
import C from "./ui/C";
import Card from "./components/Card";
function App() {
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<L />} />
          <Route path="/c" element={<Card/>} />
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
