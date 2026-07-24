import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";

function App() {

    const showCourses = true;

    return (
        <div style={{ padding: "20px" }}>
            <h1>Blogger App</h1>
            <BookDetails />
            <BlogDetails />
            {
                showCourses &&
                <CourseDetails />
            }
        </div>
    );
}

export default App;