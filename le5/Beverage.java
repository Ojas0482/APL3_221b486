abstract class Beverage
{
    void pour(int qty){
        System.out.println("pour "+qty+"ml of beverage");
    }
    abstract void add_condiment();
    
    void stir(){}
    
    void serve(){
        System.out.println("serve through waiter");
    }
    public void templateMethod(int qty){
        pour(qty);
        add_condiment();
        stir();
        serve();
    }
}

