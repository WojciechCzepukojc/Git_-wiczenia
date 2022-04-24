package pl.sda.arppl.pracawzespole.polefigur;

public abstract class AbstractFigure implements Calculable{

    protected FigureType figureType;

    public String getFigureName(){
        return figureType.getName();
    }




}
