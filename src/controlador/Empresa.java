
package controlador;

import java.util.ArrayList;
import modelo.Usuario;
import utilidades.Encriptacion;


public class Empresa {
    ArrayList <Usuario> usuarios;

    public Empresa() {
        usuarios =new ArrayList<>();
        usuarios.add(new Usuario("Mj",Encriptacion.getMD5("123"),"Maria Jesús",1));
        usuarios.add(new Usuario("Pp",Encriptacion.getMD5("123"),"Pepe",0));
        
    }
public int buscarUsuario(String login){
        int posUsuario;
        posUsuario=usuarios.indexOf(new Usuario(login));
        return posUsuario;
    }
public ArrayList<Usuario> getUsuarios(){
    return usuarios;
}
public Usuario existeUsuario(String login, String contra){
    Usuario usuario=null;
    int pos=buscarUsuario(login);
    if(pos!=-1){
        if(getUsuarios().get(pos).getPass().equals(contra)){
            usuario=getUsuarios().get(pos);
        }
    }
    return usuario;
}
public boolean grabarUsuario(String login, String contra, String nombre, int tipo){
    boolean usuarioExiste=usuarios.contains(new Usuario(login));   
    boolean usuarioGrabado=false;
    if(!usuarioExiste){
        usuarioGrabado=true;
        usuarios.add(new Usuario(login,contra,nombre,tipo));
    }
    
    return usuarioGrabado;
}
    
}
