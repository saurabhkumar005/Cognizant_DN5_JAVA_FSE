import office from "./assets/office.jpg";

function App() {

    const heading = "Office Space";

    const office = {
        Name: "DBS",
        Rent: 50000,
        Address: "Chennai"
    };

    const offices = [
        {
            Name: "DBS",
            Rent: 50000,
            Address: "Chennai"
        },

        {
            Name: "WeWork",
            Rent: 75000,
            Address: "Bangalore"
        },

        {
            Name: "Regus",
            Rent: 45000,
            Address: "Hyderabad"
        }
    ];

    return (

        <div style={{ padding: "20px" }}>
            <h1>{heading}, at Affordable Range</h1>
            <img src={office} alt="Office" width="400"
            />

            <hr />

            {
                offices.map((item) => (
                    <div key={item.Name}>
                        <h2>Name : {item.Name}</h2>
                        <h3
                            style={{
                                color:
                                    item.Rent > 60000
                                        ? "green"
                                        : "red"
                            }}
                        >
                            Rent : Rs. {item.Rent}
                        </h3>
                        <h3>
                            Address : {item.Address}
                        </h3>
                        <hr />
                    </div>
                ))
            }
        </div>
    );

}

export default App;