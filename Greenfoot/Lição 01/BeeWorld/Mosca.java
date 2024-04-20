import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe mosca destinada a fazer parte do jogo BeeWorld
 * 
 * @author (Rhuan Gimenez) 
 * @version (a version number or a date)
 */
public class Mosca extends Actor
{
    /**
     * metodo act sempre executado quando o botão act for apertado ou fica
       em execução quando apertar o run*/
    public void act()
    {
        move(1);
        if (isAtEdge()){
        turn(180);
        }
        
    }
}
