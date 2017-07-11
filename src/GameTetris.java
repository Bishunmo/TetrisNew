import com.sun.xml.internal.bind.v2.TODO;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


/**
 * Created by Ilia on 11.07.2017.
 */
public class GameTetris {
    final String TITLE_OF_PROGRAM = "Tetris";
    final int BLOCK_SIZE = 25;
    final int ARC_RADIUS = 6; //round shapes
    final int FIELD_WIDTH = 10;
    final int FIELD_HEIGHT = 18;
    final int START_LOCATION = 180;
    final int FIELD_DX = 7;
    final int FIELD_DY = 26;
    final int LEFT = 37;
    final int UP = 38;
    final int RIGHT = 39;
    final int DOWN = 40;
    final int SHOW_DELAY = 350;  //delay for animation
    final int[][][] SHAPES = {
            {{0,0,0,0}, {1,1,1,1}, {0,0,0,0}, {0,0,0,0}, {4, 0x00f0f0}}, // I
            {{0,0,0,0}, {1,1,1,0}, {0,1,1,0}, {0,0,0,0}, {4, 0xf0f000}}, // O
            {{1,0,0,0}, {1,1,1,0}, {0,0,0,0}, {0,0,0,0}, {3, 0x0000f0}}, // J
            {{0,0,1,0}, {1,1,1,0}, {0,0,0,0}, {0,0,0,0}, {3, 0xf0a000}}, // L
            {{0,1,1,0}, {1,1,0,0}, {0,0,0,0}, {0,0,0,0}, {3, 0x00f000}}, // S
            {{0,1,1,0}, {0,1,0,0}, {0,0,0,0}, {0,0,0,0}, {3, 0xa000f0}}, // T
            {{1,1,0,0}, {0,1,1,0}, {0,0,0,0}, {0,0,0,0}, {3, 0xf00000}}, // Z
    };
    final int[] SCORES = {100, 300, 700, 1500};  //for line removal 1/2/3/4
    int gameScores = 0;
    int[][] mine = new int[FIELD_HEIGHT + 1][FIELD_WIDTH];  //size of glass
    JFrame frame; //main window
    Canvas canvasPanel = new Canvas();
    Random random = new Random();
    Figure figure = new Figure();
    boolean gameOver = false;
    final int[][] GAME_OVER_MSG = {

    };



    public static void main(String[] args) {
        new GameTetris().go();
    }

    void go() {

    }

    class Figure {

    }
}
