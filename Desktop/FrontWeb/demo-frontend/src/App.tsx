import './App.css'
import {createBrowserRouter, RouterProvider} from "react-router-dom";

import {QueryClient, QueryClientProvider} from "@tanstack/react-query";
import {lazy, Suspense} from "react";

const User = lazy(() => import("./admin/user"));
const GroundForm = lazy(() => import("./admin/ground/Form"));
const Home = lazy(() => import("./home"));


const Ground = lazy(() => import("./admin/ground"));
const Login = lazy(() => import("./login"));
const Register = lazy(() => import("./register"));
const UserForm = lazy(() => import("./admin/user/Form"));
const Book = lazy(() => import("./admin/book"));
const Dashboard = lazy(() => import("./admin/dashboard"));
const UnAuthorized = lazy(() => import("./admin/Unauthorized"));
const Admin = lazy(() => import("./admin"));




const queryClient = new QueryClient()


function App() {

    const privateRoute = [
        {path: '/admin', element: <Admin/>
            ,children:[
                {path: "/admin/ground", element: <Suspense><Ground/></Suspense>,errorElement:<>error</>
                },
                {path: "/admin/ground/form", element: <Suspense><GroundForm/></Suspense>,errorElement:<>error</>},
                {path: "/admin/user", element:<Suspense> <User/></Suspense>,errorElement:<>error</>},
                {path: "/admin/user/form", element: <Suspense><UserForm/></Suspense>,errorElement:<>error</>},
                {path: "/admin/book", element: <Suspense><Book/></Suspense>,errorElement:<>error</>},
                {path: "/admin/dashboard", element: <Suspense><Dashboard/></Suspense>,errorElement:<>error</>},
            ]}
    ]
    const publicRoute = [
        {path: '/login', element: <Suspense><Login/></Suspense>,errorElement:<>error</>},
        {path: '/register', element:<Suspense> <Register/></Suspense>,errorElement:<>error</>},
        {path: '', element: <Suspense><Home/></Suspense>,errorElement:<>error</>},
        {path: "*", element:<Suspense> <UnAuthorized/></Suspense>,errorElement:<>error</>}
    ]

    const isLoggedIn = true;

    return (
        <>
            <QueryClientProvider client={queryClient}>

                <RouterProvider router={
                    createBrowserRouter(
                        isLoggedIn ? privateRoute : publicRoute
                    )
                }/>
            </QueryClientProvider>
        </>
    )
}

export default App