function BlogDetails() {

    const blogs = [

        {
            id: 1,
            title: "React Hooks",
            author: "John"
        },
        {
            id: 2,
            title: "Spring Boot REST API",
            author: "David"
        }
    ];

    return (

        <div>
            <h2>Blog Details</h2>
            {
                blogs.map((blog) => (
                    <div key={blog.id}>
                        <p>
                            <b>{blog.title}</b>
                        </p>
                        <p>Author : {blog.author}</p>
                        <hr />
                    </div>
                ))
            }
        </div>
    );
}

export default BlogDetails;