import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe que vai representar o placar no jogo BeeWorld.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Placar extends Actor
{
    /**
     * 
     */
    //variavei ou Campos ou Instancia
    private String texto;
    private int tamanhoTexto;
    private Color corFonte;
    public Placar()
    {
       texto = "Score: 0";
       tamanhoTexto = 20;
       corFonte = Color.RED;
       atualizarImagem();
    }
    //Getters (acessadores de campos)e Setters (modificadores de campos)
    public String getTexto(){
        return texto;
    }
    public void setTexto(String value){
        texto = value;
        atualizarImagem();
    }
    public void act()
    {
        // 
    }

    public void atualizarImagem()
    {
        GreenfootImage img = new GreenfootImage(tamanhoTexto * texto.length(), tamanhoTexto);
        img.setColor(corFonte); //Fonte, Negrito, Italico e tamanho da fonte
        img.setFont(new Font("Arial",true,false,tamanhoTexto));
        img.drawString(texto, 0, tamanhoTexto);
        setImage(img);
    }
}
