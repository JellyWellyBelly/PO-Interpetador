package jogogalo.textui.main;

import pt.utl.ist.po.ui.Menu;
import pt.utl.ist.po.ui.Command;

import jogogalo.textui.view.ShowGame;
import jogogalo.textui.view.ShowNumberOfGames;
import jogogalo.textui.view.ShowWinner;

import jogogalo.core.AplicacaoJogoGalo;

/**
 * Command for showing data of old games. creates a menu with two options for showing information
 * about fineshed games.
 */
public class ViewData extends Command<AplicacaoJogoGalo> {

    /**
     * Constructor.
     * 
     * @param app the target entity.
     */
    public ViewData(AplicacaoJogoGalo ent) {
        super("Mostar Histórico", ent);
    }

    /**
     * Execute the command.
     */
    @Override
    @SuppressWarnings("nls")
    public final void execute() {
	    Menu newMenu = new Menu("Estatisticas do Jogo", new Command<?>[] {
            new ShowGame(entity()),
            new ShowNumberOfGames(entity()),
            new ShowWinner(entity())
        });

        newMenu.open();

    }
}