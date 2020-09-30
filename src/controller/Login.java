package controller;


import javax.faces.bean.*;
import java.util.Locale;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

@ManagedBean(name = "myLogin")
@RequestScoped

public class Login {

   UIViewRoot view = FacesContext.getCurrentInstance().getViewRoot();

    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    private String userName, password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String check() {
        if (!(userName.equals("meysam") && password.equals("123"))) {
            result = "user name or password is not valid!!";
            return null;
        }
        else
        {
            return "pageTwo";
        }

    }

    public void changeToFarsi()
    {
        view.setLocale(new Locale("fa"));
    }
    public void changeToEnglish()
    {
        view.setLocale(new Locale("en"));
    }
    public void changeToTurkish()
    {
        view.setLocale(new Locale("po"));
    }



}
