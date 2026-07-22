import './App.css';

function App() {

  const offices = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image:
        "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=400",
    },
    {
      Name: "Regus",
      Rent: 75000,
      Address: "Bangalore",
      Image:
        "https://images.unsplash.com/photo-1497366412874-3415097a27e7?w=400",
    },
    {
      Name: "WeWork",
      Rent: 55000,
      Address: "Hyderabad",
      Image:
        "https://images.unsplash.com/photo-1497366216548-37526070297c?w=400",
    },
  ];

  return (
    <div className="container">
      <h1>Office Space, at Affordable Range</h1>

      <div className="officeContainer">
        {offices.map((item, index) => {

          let colors = [];

          if (item.Rent <= 60000) {
            colors.push("textRed");
          } else {
            colors.push("textGreen");
          }

          return (
            <div key={index} className="officeCard">

              <img
                src={item.Image}
                alt="Office Space"
                width="250"
                height="180"
              />

              <h2>Name: {item.Name}</h2>

              <h3 className={colors.join(" ")}>
                Rent: Rs. {item.Rent}
              </h3>

              <h3>Address: {item.Address}</h3>

            </div>
          );
        })}
      </div>
    </div>
  );
}

export default App;