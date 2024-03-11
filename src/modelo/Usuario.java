
package modelo;

import java.util.Objects;


public class Usuario {
    private String login;
    private String pass;
    private String nombre;
    private int tipo;

    public Usuario(String login) {
        this.login = login;
    }

    public Usuario(String login, String pass, String nombre, int tipo) {
        this.login = login;
        this.pass = pass;
        this.nombre = nombre;
        this.tipo=tipo;
    }
    

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTipo() {
        return tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.login);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.login, other.login);
    }
    
}
