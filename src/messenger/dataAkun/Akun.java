
package messenger.dataAkun;

/**
 *
 * @author eko
 */
public class Akun {
    public String name ="eko";
    public String username = "admin";
    public String pasword= "admin";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
    
    @Override
    public String toString(){
        return name+" - "+ username+" - "+pasword;
    }
    
}
