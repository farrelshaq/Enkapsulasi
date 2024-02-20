
package enkap_user;


public class Enkap_User {

    
    public static void main(String[] args) {
        
        User alel = new User ("alel", "1234", 0, false);
                
                alel.setusername("alel");
                alel.setpassword("1234");
                alel.setId(0);
                alel.setStatus(false);
                
                System.out.println("username; " + alel.getUsername());
                System.out.println("password " + alel.getPassword());
                System.out.println("id : " + alel.getId() );
                System.out.println("status : " + alel.isStatus());
    }
    
}
