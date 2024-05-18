import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Mosca destinada a fazer parte do jogo BeeWorld.
 * 
 * @author João
 * @version 2024-04-20
 */
public class Mosca extends Inseto
{
    /**
     * Método Act é executado sempre que apertamos o botão Act ou ficará em execução
     * quando apertamos o botão Run.
     */
    private int velocidade;
    public Mosca(){
        velocidade = 1;
    }
    /*constructor padrão, não recebe parâmetros*/
    public Mosca( int vel, int ang){
        velocidade = vel;
        setRotation(ang);
    }
    public void act()
    {
        // Add your action code here.
        move(velocidade);
        verificarCanto();
    }
}
