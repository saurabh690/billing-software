import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Menubar from "./components/Menubar/Menubar.jsx";
import Dashboard from "./pages/Dashboard/Dashboard.jsx";
import Explore from "./pages/Explore/Explore.jsx";
import ManageCategory from "./pages/ManageCategory/ManageCategory.jsx";
import ManageItems from "./pages/ManageItems/ManageItems.jsx";
import ManageUser from "./pages/ManageUsers/ManageUser.jsx";

const App = () => {
  return (
    <Router>
      <Menubar />
      <Routes>
        <Route path="/dashboard" element={<Dashboard />} />
        <Route path="/explore" element={<Explore />} />
        <Route path="/users" element={<ManageUser />} />
        <Route path="/items" element={<ManageItems />} />
        <Route path="/category" element={<ManageCategory />} />
        <Route path="/" element={<Dashboard />} />
      </Routes>
    </Router>
  );
};

export default App;
