package jogogalo.textui.view;

import pt.utl.ist.po.ui.Menu;
import pt.utl.ist.po.ui.Command;
import pt.utl.ist.po.ui.Display;
import pt.utl.ist.po.ui.Form;
import pt.utl.ist.po.ui.InputInteger;

import jogogalo.core.AplicacaoJogoGalo;
import jogogalo.core.JogoGalo;
import jogogalo.core.ResultadoJogo;

/**
 * Command for showing the overall winner of the game.
 */
public class ShowWinner extends Command<AplicacaoJogoGalo> {

    /**
     * Constructor.
     * 
     * @param ent the target entity.
     */
    public ShowWinner(AplicacaoJogoGalo ent) {
        super("Mostrar Vencedor", ent);
    }

    /**
     * Execute the command.
     */
    @Override
    @SuppressWarnings("nls")
    public final void execute() {
        int numJogos = entity().obtemNumeroJogos(), i,
            vitoriaJogador1 = 0, vitoriaJogador2 = 0;
        Display vencedor = new Display();

        for(i = 1; i <= numJogos; i++) {
            ResultadoJogo res = entity().obtemJogo(i).obtemResultado();
            
            if(ResultadoJogo.JOGADOR_1 == res)
                vitoriaJogador1++;

            else if(ResultadoJogo.JOGADOR_2 == res)
                vitoriaJogador2++;
        }

        if(vitoriaJogador1 > vitoriaJogador2) {
            vencedor.add("Jogador 1");
            vencedor.display();
        }

        else if(vitoriaJogador1 < vitoriaJogador2) {
            vencedor.add("Jogador 2");
            vencedor.display();
        }

        else {
            vencedor.add("Empate");
            vencedor.display();
        }
    }

    public int obtemAutoria() {
    	return new int [] {57, 84774, 84747};

    }
}