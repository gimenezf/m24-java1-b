import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aranha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aranha extends Actor
{
    /**
     * Act - do whatever the Aranha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //move de um em um pixel
        move(1);
        //verifica se o numero gerado aleatoriamente é menor ou igual a vinte
        if(Greenfoot.getRandomNumber(100)+1 <= 20)
        {
            //gira aleatoriamente em um intervalo de 1 a 20
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    }
}
