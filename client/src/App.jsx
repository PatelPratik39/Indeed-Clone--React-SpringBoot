import CreatePost from "./components/pages/CreatePost";
import Home from "./components/pages/Home";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import { routePath } from "./routes/RoutePath";

// import "./App.css";

function App() {
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path={routePath.home} element={<Home />} />
          <Route path={routePath.create} element={<CreatePost />} />
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
