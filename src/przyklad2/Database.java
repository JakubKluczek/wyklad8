package przyklad2;

public class Database {

    private static Database bazadanych;

    private String server;
    private String port;

    public static Database createDatabase(){
        if(bazadanych==null){
            bazadanych=new Database("","");
        }
        return bazadanych;

    }


    private Database (String server, String port) {
        this.server = server;
        this.port = port;
    }

    public void openConnection(){

    }
    public void sendSql(String sql){

    }

    public void closeConnection(){


    }
}
