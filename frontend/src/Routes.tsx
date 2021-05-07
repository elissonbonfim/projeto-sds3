import Dashboard from 'pages/Dashboard';
import Home from 'pages/Home';
import { BrowserRouter, Route, Switch } from 'react-router-dom';

function Routes() {
    return (
        <BrowserRouter>
            <Switch>
                <Route path="/" exact>
                    <Home></Home>
                </Route>
                <Route path="/dashboard" exact>
                    <Dashboard></Dashboard>
                </Route>
            </Switch>
        </BrowserRouter>
    );
}

export default Routes;