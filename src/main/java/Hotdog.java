public class Hotdog {
    private int sausage;

    public Hotdog(int sausage)
    {
        this.sausage=sausage;
    }

    public void gotowe()
    {
        setSausage(1);
        System.out.println("hotdog gotowy!");
    }
    
    public void setSausage(int sausage) {
        this.sausage = sausage;
    }
}
