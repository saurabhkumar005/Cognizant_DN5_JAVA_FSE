import { useState } from "react";
import GuestPage from "./components/GuestPage";
import UserPage from "./components/UserPage";

function App() {

    const [loggedIn, setLoggedIn] = useState(false);

    return (

        <div>
            <h1>Ticket Booking App</h1>
            {
                loggedIn
                ?
                <>
                    <button onClick={() => setLoggedIn(false)}>
                        Logout
                    </button>
                    <UserPage />
                </>
                :
                <>
                    <button onClick={() => setLoggedIn(true)}>
                        Login
                    </button>
                    <GuestPage />
                </>
            }
        </div>
    );
}

export default App;