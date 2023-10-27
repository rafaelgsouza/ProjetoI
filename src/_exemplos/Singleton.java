package _exemplos;

public final class Singleton {
    
    //objeto único da classe Singleton a ser retornado por getInstance
    private static final Singleton singleton = new Singleton();
    
    private Singleton(){
        
    }
    
    public static Singleton getInstance(){
        return singleton;
    }
    
}
