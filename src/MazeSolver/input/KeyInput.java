
package mazesolver.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener  {

    private boolean[]keys  ;
    public boolean up,down,left,right,quit,aUp,aDown,aLeft,aRight;
    
    public KeyInput(){
        keys=new boolean[256];
    }
    public void tick(){
       up=keys[KeyEvent.VK_W];
       down=keys[KeyEvent.VK_S];
       left=keys[KeyEvent.VK_A];
       right=keys[KeyEvent.VK_D];
       quit=keys[KeyEvent.VK_ENTER];
       aRight=keys[KeyEvent.VK_RIGHT];
       aLeft=keys[KeyEvent.VK_LEFT];
       aUp=keys[KeyEvent.VK_UP];
       aDown=keys[KeyEvent.VK_DOWN];
       
    }
    

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()]=true;
        //System.out.println("pressed");
      
    }

    @Override
    public void keyReleased(KeyEvent e) {
          keys[e.getKeyCode()]=false;
    }
    @Override
    public void keyTyped(KeyEvent e) {
        
    }
    
}
