package game;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * @Auther: yinw_puzh
 * @Date: 2019/2/13
 * @Description: game
 * @version: 1.0
 */
public class Plane extends GameObject{
    int speed = 3;
    boolean left,up,right,down;
    boolean live = true;

    @Override
    public void drawSelf(Graphics g) {
        if(live){
            super.drawSelf(g);
            g.drawImage(img,(int)x,(int)y,null);
            if(left){
                x -= speed;
            }
            if(right){
                x += speed;
            }
            if(up){
                y -= speed;
            }
            if(down){
                y += speed;
            }
        }
        else{

        }

    }

    public Plane(Image img,double x,double y){
        super(img,x,y);
        this.speed = 3;
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);
    }
    /**
     * 功能描述:按下某个键 增加相应的方向
     */
    public void addDirection(KeyEvent e){
        switch (e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                left = true;
                break;
            case KeyEvent.VK_RIGHT:
                right = true;
                break;
            case KeyEvent.VK_UP:
                up = true;
                break;
            case KeyEvent.VK_DOWN:
                down = true;
                break;
        }
    }
    /**
     * 功能描述:按下某个键 取消相应的方向
     */
    public void minusDirection(KeyEvent e){
        switch (e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                left = false;
                break;
            case KeyEvent.VK_RIGHT:
                right = false;
                break;
            case KeyEvent.VK_UP:
                up = false;
                break;
            case KeyEvent.VK_DOWN:
                down = false;
                break;
        }
    }
}
