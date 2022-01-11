import "bootstrap/js/src/collapse.js";
import { NavLink } from "react-router-dom";
import "./styles.css";

const Navbar = () => {
  return (
    <nav className="navbar navbar-expand-md navbar-dark main-nav">
      <div className="container-fluid">
        <a href="link">
          <h4>BackupControl</h4>
        </a>
        <button
          className="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#backupcontrol-navbar"
          aria-controls="backupcontrol-navbar"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-icon"></span>
        </button>
        <div className="collapse navbar-collapse" id="backupcontrol-navbar">
          <ul className="navbar-nav offset-md-2 main-menu">
            <li>
              <NavLink
                to="/"
                className={({ isActive }) => (isActive ? "active" : "")}
              >
                DASHBOARD
              </NavLink>
            </li>
            <li>
              <NavLink
                to="/pacotes"
                className={({ isActive }) => (isActive ? "active" : "")}
              >
                PACOTES
              </NavLink>
            </li>
            <li>
              <NavLink
                to="/releases"
                className={({ isActive }) => (isActive ? "active" : "")}
              >
                RELEASES
              </NavLink>
            </li>
            <li>
              <NavLink
                to="/chamados"
                className={({ isActive }) => (isActive ? "active" : "")}
              >
                CHAMADOS
              </NavLink>
            </li>
            <li>
              <NavLink
                to="/usuarios"
                className={({ isActive }) => (isActive ? "active" : "")}
              >
                USUÁRIOS
              </NavLink>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  );
};

export default Navbar;
