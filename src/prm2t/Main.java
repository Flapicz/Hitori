package prm2t;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Main implements ActionListener {
    GUI gui;
    Saver saver;
    Generator generator;
    Board board;

    Solver solver;
    public void initGUI(){
        gui = new GUI(this);
    }

    public GUI getGui() {
        return gui;
    }



    public static void  main(String[] args) throws IOException {
                Main main = new Main();
                main.generator = new Generator();
                //main.generator.generateFromText("resources\\plansza.txt");
                main.generator.generateRandom(0);

                main.board = new Board(main.generator.getBoard());
                main.saver = new Saver(main.board, main.generator);
                main.solver = new Solver(main.board);

                main.initGUI();
                GUI gui = main.getGui();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
