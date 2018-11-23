/**
 * 
Sistema de sessão:
* -----------------------------------------------------
* Esse codigo seria executado pós login.
Sessao sessao = Sessao.getInstance();
sessao.setUsuario(AQUI VOCÊ VAI PASSAR UM TIPO AUTH);
* -----------------------------------------------------
e durante o sistema vc descobre o usuario logado
Sessao.getInstance().getUsuario();
Ou na Sessao vc pode armazenar um map para guardar mais infromações como um session HTTP no caso um Cargo.
* -----------------------------------------------------
* 
* 
 */
package dao;

/**
 *
 * @author guilherme.mendes
 */
public class Sessao{
   private static Sessao instance = null;
   private Auth usuario;
   private Sessao(){
   }
   public void setUsuario(Auth usuario){
      this.usuario = usuario;
   }
   public Auth getUsuario(){
       return usuario;
   }
   public static Sessao getInstance(){
         if(instance == null){
               instance = new Sessao();
         }
        return instance;
   }
}
