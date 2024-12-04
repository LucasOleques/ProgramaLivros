package EntidadesMVC.Model;

public class Usuario {
    private String nomeusuario;
    private String loginusuario;
    private String senhausuario;

    public String getNomeusuario() {
        return nomeusuario;
    }
    public String getLoginusuario() {
        return loginusuario;
    }
    public String getSenhausuario() {
        return senhausuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }
    public void setLoginusuario(String loginusuario) {
        this.loginusuario = loginusuario;
    }
    public void setSenhausuario(String senhausuario) {
        this.senhausuario = senhausuario;
    }
}
