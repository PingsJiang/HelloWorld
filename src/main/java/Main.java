import org.apache.ibatis.jdbc.SQL;

public class Main {

    public String get()
    { return new SQL(){{
            SELECT();
            FROM();
            WHERE();
            if (true){

            }
        }
    }.toString();}

    public static void main(String[] args) {

    }
}
