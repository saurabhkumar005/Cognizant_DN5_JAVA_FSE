function BookDetails() {

    const books = [
        { id: 1, name: "React Basics", price: 450 },
        { id: 2, name: "Java Programming", price: 600 },
        { id: 3, name: "Spring Boot", price: 700 }
    ];

    return (

        <div>
            <h2>Book Details</h2>
            {
                books.map((book) => (
                    <div key={book.id}>
                        <p>
                            <b>{book.name}</b>
                        </p>
                        <p>Price : ₹{book.price}</p>
                        <hr />
                    </div>
                ))
            }
        </div>
    );
}

export default BookDetails;