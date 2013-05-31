package br.fat.agendaeventos.teste;

import br.fat.agendaeventos.dao.ContatoDAO;
import br.fat.agendaeventos.modelo.Contato;
import br.fat.agendaeventos.modelo.EventoParticipante;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class TesteHibernate {
    public static void main(String[] args) {
        ContatoDAO dao = new ContatoDAO();
        dao.getContato().setNome("Alemão");
        //dao.getContato().setSobreNome("Bento");
        dao.getContato().setFone("888888888");
        dao.getContato().setEmail("alemao@hotmail.com");
        
        dao.inserir();
//        List<Contato> contatos = dao.findAll();
//        for (Contato contato : contatos) {
//            System.out.println(contato);
//            List<EventoParticipante> ep = (List<EventoParticipante>) contato.getEventoParticipanteCollection();
//            System.out.println("Eventos que o contato " + contato.getNome() + " esta inscrito");
//            for (EventoParticipante ev : ep) {
//                System.out.println(ev.getEvento().getOQueE());
//            }
//        }
        
//        JOptionPane.showMessageDialog(null, "Código gerado " + dao.getContato().getId());
    }
}
