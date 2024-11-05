package Model;

public class Usuario {
    private String loginusuario;
    private String senhausuario;

    //--------------------------------------------------------------------------------------------
    public Usuario(String loginusuario, String senhausuario) {
        this.loginusuario = loginusuario;
        this.senhausuario = senhausuario;
    }
    //--------------------------------------------------------------------------------------------
    public String getLoginusuario() {
        return loginusuario;
    }
    public String getSenhausuario() {
        return senhausuario;
    }
    //--------------------------------------------------------------------------------------------
    public void setLoginusuario(String loginusuario) {
        this.loginusuario = loginusuario;
    }
    public void setSenhausuario(String senhausuario) {
        this.senhausuario = senhausuario;
    }
    //--------------------------------------------------------------------------------------------
}
