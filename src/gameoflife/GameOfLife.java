
package gameoflife;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Shakeer
 */
/* has 2 still lifes (block)
   {false,true,false,true,false,false,true,true,false},
        {true,true,true,false,true,true,false,true,true},
        {false,true,true,true,false,true,true,true,false},
        {false,true,false,false,true,false,false,true,true},
        {false,true,false,true,true,false,true,false,false},
        {true,true,false,true,true,false,false,false,true},
        {true,true,true,false,true,true,false,false,true},
        {false,true,false,false,true,false,false,true,true},
        {false,true,false,true,true,false,true,false,false}
        */
/* has 1 still life (boat)
   {false,true,false,true,false,false,true,true,false},
        {true,true,true,false,true,true,false,true,true},
        {false,true,true,true,false,true,true,true,false},
        {false,true,false,false,true,false,false,true,true},
        {false,true,false,true,true,false,true,false,false},
        {true,true,false,true,true,false,false,false,true},
        {true,true,true,false,true,true,false,false,true},
        {true,true,false,false,true,false,false,true,true},
        {false,true,false,true,true,false,true,false,false}
        */
/* has 1 still life (block) and 1 oscillator(blinker)
   {false,true,false,true,false,false,true,true,false},
        {true,true,true,false,true,true,false,true,true},
        {false,true,true,true,false,true,true,true,false},
        {false,true,false,false,true,false,false,true,true},
        {false,true,false,true,true,false,true,false,false},
        {true,true,false,true,true,false,false,false,true},
        {true,true,true,false,true,true,false,false,true},
        {true,true,false,false,true,false,false,true,false},
        {false,true,false,true,true,false,true,false,false}
        */
/* has 1 boat
 * {false,true,false,true,false,false,true,true,true},
        {true,true,true,false,true,true,false,true,true},
        {false,true,true,true,false,true,true,true,false},
        {false,true,false,false,true,false,false,true,true},
        {false,true,false,true,true,false,true,false,false},
        {true,true,false,true,true,false,false,false,true},
        {true,true,true,false,true,true,false,false,true},
        {true,true,false,false,true,false,false,true,false},
        {false,true,false,true,true,false,true,false,false}
        * 
        */
/* has 1 beehive still
 * {true,true,false,true,false,false,true,true,true},
        {true,true,true,false,true,true,false,true,true},
        {false,true,true,true,false,true,true,true,false},
        {false,true,false,false,true,false,false,true,true},
        {false,true,false,true,true,false,true,false,false},
        {true,true,false,true,true,false,false,false,true},
        {true,true,true,false,true,true,false,false,true},
        {true,true,false,false,true,false,false,true,false},
        {true,true,false,true,true,false,true,false,true}
 */
/* 1 loaf and 1 beehive
 *  {true,true,false,true,false,false,true,true,false},
        {true,true,true,false,true,true,false,true,true},
        {false,true,true,true,false,true,true,true,false},
        {false,true,false,false,true,false,false,true,true},
        {false,true,false,true,true,false,true,false,false},
        {true,true,false,true,true,false,false,false,true},
        {true,true,true,false,true,true,false,false,true},
        {true,true,false,false,true,false,false,true,false},
        {false,true,false,true,true,false,true,false,true}
 */
/*long live
 * {false,true,false,true,false,false,true,false,true},
        {true,false,true,false,true,true,false,false,true},
        {false,true,false,true,false,true,false,true,false},
        {true,false,true,false,true,false,false,true,true},
        {false,true,false,true,false,false,true,false,false},
        {true,false,false,true,true,false,true,false,true},
        {false,true,false,false,true,false,true,false,true},
        {true,false,true,false,true,false,false,true,false},
        {true,true,true,true,true,true,true,true,true}
 */
/* super
 * {true,true,true,true,true,true,true,true,true},
        {true,false,false,false,false,false,false,false,true},
        {true,false,true,true,true,true,true,false,true},
        {true,false,true,false,true,false,true,false,true},
        {true,false,true,true,false,false,true,false,true},
        {true,false,true,true,true,false,true,false,true},
        {true,false,true,true,true,true,true,false,true},
        {true,false,false,false,false,false,false,false,true},
        {true,true,true,true,true,true,true,true,true}
 */
/* super (eye)
 * {true,true,true,true,true,true,true,true,true},
        {true,false,false,false,false,false,false,false,true},
        {true,false,true,true,true,true,true,false,true},
        {true,false,true,false,false,false,true,false,true},
        {true,false,true,false,false,false,true,false,true},
        {true,false,true,false,true,false,true,false,true},
        {true,false,true,true,true,true,true,false,true},
        {true,false,false,false,false,false,false,false,true},
        {true,true,true,true,true,true,true,true,true}
 */
/* eye with nose
 * {false,false,false,false,false,false,false,false,false},
        {false,true,true,true,true,true,true,true,false},
        {false,true,false,false,false,false,false,true,false},
        {false,true,true,false,false,false,true,true,false},
        {false,true,true,false,true,false,true,true,false},
        {false,true,true,false,false,false,true,true,false},
        {false,true,true,true,true,true,true,true,false},
        {false,true,true,true,true,true,true,true,false},
        {false,false,false,false,false,false,false,false,false}
 */
/* super 4 osillator(blinker)
 * {true,true,true,true,true,true,true,true,true},
        {true,false,false,false,false,false,false,false,true},
        {true,false,true,true,true,true,true,false,true},
        {true,false,true,false,false,false,true,false,true},
        {true,false,true,false,false,false,true,false,true},
        {true,false,true,false,false,false,true,false,true},
        {true,false,true,true,true,true,true,false,true},
        {true,false,false,false,false,false,false,false,true},
        {true,true,true,true,true,true,true,true,true}
 */
/* double E
 * {true,false,false,false,false,false,false,false,true},
        {true,false,false,false,false,false,false,false,true},
        {true,false,true,true,true,true,true,false,true},
        {true,false,true,false,false,false,true,false,true},
        {true,false,true,false,true,false,true,false,true},
        {true,false,true,false,false,false,true,false,true},
        {true,false,true,true,true,true,true,false,true},
        {true,false,false,false,false,false,false,false,true},
        {true,false,false,false,false,false,false,false,true}
 */
/* 2 loaf
 *  {false,false,false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false,true},
        {false,false,true,true,true,true,true,false,true},
        {false,false,true,false,false,false,true,false,true},
        {false,false,true,false,true,false,true,false,true},
        {false,false,true,false,false,false,true,false,true},
        {false,false,true,true,true,true,true,false,true},
        {false,false,false,false,false,false,false,false,true},
        {false,false,false,false,false,false,false,false,false}
 */
/* magic
 * {true,true,true,true,true,true,true,true,true},
        {false,false,false,false,false,false,false,false,false},
        {true,true,true,true,true,true,true,true,true},
        {false,false,false,false,false,false,false,false,false},
        {true,true,true,true,true,true,true,true,true},
        {false,false,false,false,false,false,false,false,false},
        {true,true,true,true,true,true,true,true,true},
        {false,false,false,false,false,false,false,false,false},
        {true,true,true,true,true,true,true,true,true}
 */
/* good design
 * {true,false,true,false,true,false,true,false,true},
        {false,false,false,false,false,false,false,false,false},
        {true,false,true,false,true,false,true,false,true},
        {false,false,false,false,false,false,false,false,false},
        {true,true,true,true,true,true,true,true,true},
        {false,false,false,false,false,false,false,false,false},
        {true,false,true,false,true,false,true,false,true},
        {false,false,false,false,false,false,false,false,false},
        {true,false,true,false,true,false,true,false,true}
 */
/* new 
 * {true,true,false,true,false,true,false,true,false},
        {true,true,true,false,true,false,true,false,true},
        {false,true,true,true,false,true,false,true,false},
        {true,false,true,false,true,false,true,false,true},
        {false,true,false,true,false,true,false,true,false},
        {true,false,true,false,true,false,true,false,true},
        {false,true,false,true,false,true,true,true,false},
        {true,false,true,false,true,false,true,true,true},
        {false,true,false,true,false,true,false,true,true}
 */
public class GameOfLife extends JFrame {

    boolean current[][]={
        {true,false,true,false,true,false,true,false,true},
        {false,false,false,false,false,false,false,false,false},
        {true,false,true,false,true,false,true,false,true},
        {false,false,false,false,false,false,false,false,false},
        {true,true,true,true,true,true,true,true,true},
        {false,false,false,false,false,false,false,false,false},
        {true,false,true,false,true,false,true,false,true},
        {false,false,false,false,false,false,false,false,false},
        {true,false,true,false,true,false,true,false,true}
        
    };
    
    //Refer the node from lefttop from the current
    private int topLeftX,topLeftY;
    //used to store the live node count
    private int count;
    //grid size
    private int maxSize;
    //Nodes of Game Of Life
    private boolean[][] nextState=new boolean[10][10];
    //Nodes  of Game Of Life in Frame
    private JTextField[][] label=new JTextField[10][10];
    private JButton startButton;
    private JLabel backLabel;
    private static int nodeX=10,nodeY=75;
    
    GameOfLife() throws InterruptedException {
        this(9);
    }

    public GameOfLife(int size) throws InterruptedException {
        if(size > 3)
            maxSize=size;
        //assign minimum size of GOL Frame
        else
            maxSize=3;
        
    }
    
    
    public static void main(String[] args) throws InterruptedException{
        GameOfLife frame = new GameOfLife();
        frame.setGOLFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.startGame();
    }
    
    
    private void setGOLFrame() {
        //create and add the cells in frame window
        for(int nodeRow=0; nodeRow < maxSize; nodeRow++){
            for(int nodeCol=0; nodeCol < maxSize; nodeCol++){
                label[nodeRow][nodeCol]=new JTextField();
                label[nodeRow][nodeCol].setEditable(false);
                label[nodeRow][nodeCol].setBounds(nodeX+150, nodeY+2, 25, 25);
                add(label[nodeRow][nodeCol]);
                nodeX+=26;
            }
            nodeX=10;
            nodeY+=26;
         }
        startButton=new JButton("start");
        startButton.setBounds(nodeX+180, nodeY+50, 150, 40);
        add(startButton);
        backLabel=new JLabel("GAME OF LIFE");
        backLabel.setBackground(Color.WHITE);
        add(backLabel);
        setTitle("GAME OF LIFE");
        setSize(500,450);
        setLocation(280, 160);
        setVisible(true);  
        
    }

    
    
    
    //start game with recursive call of method
    private void startGame() throws InterruptedException {
        int count;
        //<code>nodeRow</code> & <code>nodeCol</code> 
        //shows the index of the current cell
        for(int nodeRow=0; nodeRow < maxSize; nodeRow++){
            for(int nodeCol=0; nodeCol < maxSize; nodeCol++){
                //count has number of neighbor live cells
                count=getLiveNodeCount(nodeRow,nodeCol);
                //conditions for live cell with 3 condtions
                if(current[nodeRow][nodeCol] == true){
                    /**
                     * condition (no.1):-
                     * any live cell with fewer than 2 live neighbors dies,
                     * as if caused by under-population.
                     * condition(no.3):-
                     * any live cell with more than 3 live neighbors dies,
                     * as if by overcrowding
                     */
                    if((count < 2) || (count > 3))
                        nextState[nodeRow][nodeCol]=false;
                    /**
                     * condition(no.2):-
                     * any live cell with 2 or 3 live neighbors lives on
                     * to the next generation
                     */
                    if((count == 2) || (count == 3))
                        nextState[nodeRow][nodeCol]=true;
                }
                //condition for dead cell with 1 conditon
                else{
                    /**
                     * condition(no.4):-
                     * any dead cell with exactly 3 live neighbors become a live cell,
                     * as if by reproduction
                     */
                    if(count == 3)
                        nextState[nodeRow][nodeCol]=true;
                }
                //System.out.print(nextState[nodeRow][nodeCol]+" ");
            }
            //System.out.println();
        }
        updateGrid();
        //start the game again for the next generation
        if(this.isActive())
        startGame();
    }
    
    
    //Live Cell Count
    public int getLiveNodeCount(int x, int y) {
        topLeftX=x-1;
        topLeftY=y-1;
        count=0;
        for(int row=topLeftX; row < topLeftX+3; row++){
            for(int col=topLeftY; col < topLeftY+3; col++){
                
            //outOfBound or outOfTheRange of GOL Frame
            //Last condition tells the current calling cell for the live cell count
            if( row < 0 || col < 0 || row > (maxSize-1) || col > (maxSize-1) || ( row == x && col == y) )
                continue;
            //count the live cells
            if( current[row][col] == true )
                count++;
        }
        }
        //Return total live cell count
        return count;
    }


    
    private void updateGrid() throws InterruptedException {
        for(int nodeRow=0; nodeRow < maxSize; nodeRow++){
            for(int nodeCol=0; nodeCol < maxSize; nodeCol++){
                //update Each cell
                if(nextState[nodeRow][nodeCol] == true)
                    label[nodeRow][nodeCol].setBackground(Color.BLACK);
                else
                    label[nodeRow][nodeCol].setBackground(Color.WHITE);
                //change next generation as present generation
                current[nodeRow][nodeCol]=nextState[nodeRow][nodeCol];
            }
        }
        //wait 1sec for the next generation
        Thread.sleep(1000);
    }

    

}
