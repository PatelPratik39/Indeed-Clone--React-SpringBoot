import CreatePost from "./components/pages/CreatePost";
import Home from "./components/pages/Home";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import { routePath } from "./routes/RoutePath";
import AllPost from "./components/pages/AllPost";


function App() {
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path={routePath.home} element={<Home />} />
          <Route path={routePath.create} element={<CreatePost />} />
          <Route path={routePath.posts} element={<AllPost />} />
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
