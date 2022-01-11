import "./styles.css";

const Dashboard = () => {
  return (
    <div className="dashboard-container">
      <div className="dashboard-title">
        <h3>Dashboard</h3>
      </div>
      <div className="row dashboard-data">
        <div className="col-sm-6 col-lg-4 col-xl-4 mb-3 ">
          <h6>ÚLTIMO PACOTE LIBERADO:</h6>
          <div className="base-card dashboard-data-card">
            <p className="dashboard-data-card-title">PACOTE 243</p>
            <div className="dashboard-data-card-container-bottom">
              <div className="dashboard-data-card-container-bottom-left">
                <p className="dashboard-data-card-container-bottom-left-text-regular">
                  Abertura:
                </p>
                <p className="dashboard-data-card-container-bottom-left-text-bold">
                  28/11/2021
                </p>
              </div>
              <div className="dashboard-data-card-container-bottom-right">
                <p className="dashboard-data-card-container-bottom-right-text-regular">
                  Término:
                </p>
                <p className="dashboard-data-card-container-bottom-right-text-bold">
                  28/12/2021
                </p>
              </div>
            </div>
          </div>
        </div>
        <div className="col-sm-6 col-lg-4 col-xl-4 mb-3 ">
          <h6>PACOTE ATUAL:</h6>
          <div className="base-card dashboard-data-card">
            <p className="dashboard-data-card-title">PACOTE 244</p>
            <div className="dashboard-data-card-container-bottom">
              <div className="dashboard-data-card-container-bottom-left">
                <p className="dashboard-data-card-container-bottom-left-text-regular">
                  Abertura:
                </p>
                <p className="dashboard-data-card-container-bottom-left-text-bold">
                  28/12/2021
                </p>
              </div>
              <div className="dashboard-data-card-container-bottom-right">
                <p className="dashboard-data-card-container-bottom-right-text-regular">
                  Término:
                </p>
                <p className="dashboard-data-card-container-bottom-right-text-bold">
                  28/01/2022
                </p>
              </div>
            </div>
          </div>
        </div>
        <div className="col-sm-6 col-lg-4 col-xl-4 mb-3 ">
          <h6>RELEASES PACOTE ATUAL:</h6>
          <div className="base-card dashboard-data-card">
            <p className="dashboard-data-card-title">10 RELEASES</p>
            <div className="dashboard-data-card-container-bottom">
              <div className="dashboard-data-card-container-bottom-left">
                <p className="dashboard-data-card-container-bottom-left-text-regular">
                  Chamados:
                </p>
                <p className="dashboard-data-card-container-bottom-left-text-bold">
                  12
                </p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Dashboard;
