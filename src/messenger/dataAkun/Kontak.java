/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messenger.dataAkun;

/**
 *
 * @author eko
 */
public class Kontak{
    public static String nameTeman="fajar";
    public static String usernameTeman = "fajar45";
    public static String status = "galau banyak tugas";

    public static String getNameTeman() {
        return nameTeman;
    }

    public static void setNameTeman(String nameTeman) {
        Kontak.nameTeman = nameTeman;
    }

    public static String getUsernameTeman() {
        return usernameTeman;
    }

    public static void setUsernameTeman(String usernameTeman) {
        Kontak.usernameTeman = usernameTeman;
    }

    public static String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        Kontak.status = status;
    }

   
    @Override
    public String toString(){
        return nameTeman+" - "+ usernameTeman+" -"+" - "+status;
    }
    
}
