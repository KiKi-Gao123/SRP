public class srp {
    public static void main(String[] args) {
        LoginForm lf = new LoginForm();
        UserDAO ud = new UserDAO();
        DBUtil db = new DBUtil();
        MainClass mc = new MainClass();
        mc.start();
        lf.login();
        ud.change();
        db.connect();


    }
}
