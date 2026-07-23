const T20Players = [
    "First Player",
    "Second Player",
    "Third Player"
];

const RanjiPlayers = [
    "Fourth Player",
    "Fifth Player",
    "Sixth Player"
];

export const IndianPlayers = [
    ...T20Players,
    ...RanjiPlayers
];

function ListofIndianPlayers() {
    return (
        <ul>
            {
                IndianPlayers.map((player) => (
                    <li key={player}>
                        Mr. {player}
                    </li>
                ))

            }
        </ul>

    );

}

export default ListofIndianPlayers;