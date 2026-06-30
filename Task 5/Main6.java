
interface HttpService {
    void handleHttpRequest();
}

interface DatabaseManager {
    void executeSqlStatement();
}

interface ContainerOps {
    void restartDockerContainer();
}


class WebController implements HttpService {

    @Override
    public void handleHttpRequest() {
        System.out.println("Routing traffic to endpoint.");
    }
}


class PostgresDatabase implements DatabaseManager {

    @Override
    public void executeSqlStatement() {
        System.out.println("Executing SQL query on PostgreSQL.");
    }
}


class DockerService implements ContainerOps {

    @Override
    public void restartDockerContainer() {
        System.out.println("Restarting Docker container.");
    }
}


public class Main{
    public static void main(String[] args){
        HttpService controller = new WebController();
        controller.handleHttpRequest();

        DatabaseManager db = new PostgresDatabase();
        db.executeSqlStatement();

        ContainerOps docker = new DockerService();
        docker.restartDockerContainer();
        
    }
}
