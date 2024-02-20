package enkap_user;

public class User {
    private String username;
    private String password;
    private int id;
    private boolean status;
    
    public User(String username,String password, int id, boolean status){
        this.username = username;
        this.password = password;
        this.id = id;
        this.status = status;
        
      
    }
      public void setusername(String username){
        this.username = username;
      }
    public void setpassword(String password){
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}