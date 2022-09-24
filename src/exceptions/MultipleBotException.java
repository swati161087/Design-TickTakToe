package exceptions;

public class MultipleBotException extends Exception{
    public MultipleBotException(){
        super("A Game cannot have multiple bot players");
    }

}
