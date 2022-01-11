import { BrowserRouter, Routes, Route, useNavigate } from "react-router-dom";

import Navbar from "components/Navbar";
import Dashboard from "pages/Dashboard";
import Pacotes from "pages/Pacotes/List";
import Releases from "pages/Releases/List";
import Chamados from "pages/Chamados/List";

import Usuarios from "pages/Usuarios/List";

import "./App.css";
import { useEffect } from "react";

const routes = () => {
  function Redirect({ to }: any) {
    let navigate = useNavigate();
    useEffect(() => {
      navigate(to);
    });
    return null;
  }

  return (
    <BrowserRouter>
      <Navbar />
      <div className="app-container">
        <Routes>
          <Route path="/" element={<Dashboard />} />

          <Route path="/pacotes/list" element={<Pacotes />} />
          <Route path="/pacotes" element={<Redirect to="/pacotes/list" />} />

          <Route path="/releases" element={<Releases />} />
          <Route path="/releases" element={<Redirect to="/releases/list" />} />

          <Route path="/chamados" element={<Chamados />} />
          <Route path="/chamados" element={<Redirect to="/chamados/list" />} />

          <Route path="/usuarios" element={<Usuarios />} />
          <Route path="/usuarios" element={<Redirect to="/usuarios/list" />} />
        </Routes>
      </div>
    </BrowserRouter>
  );
};

export default routes;
