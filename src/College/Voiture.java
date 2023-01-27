package College;

public class Voiture extends Vehicle {
    private int speed;
    private String sound;
    private boolean isAccelerate;
    private boolean isTotalLoss;

    private String carStatus;

    public Voiture() {
        super();
    }

    public Voiture(int speed, String sound) {
        super();
        this.sound = sound;
        this.speed = speed;
    }

    public Voiture(String color, String model, int year, int numOfDoor, int price, int speed, String sound) {
        super(color, model, year, numOfDoor, price);
        this.speed = speed;
        this.sound = sound;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public boolean isAccelerate() {
        return isAccelerate;
    }

    public void setAccelerate(boolean accelerate) {
        isAccelerate = accelerate;
    }

    public boolean isTotalLoss() {
        return isTotalLoss;
    }

    public void setTotalLoss(boolean totalLoss) {
        isTotalLoss = totalLoss;
    }

    //Customized Functionpublic
    void displayVoiture(Voiture v) {
        System.out.println(v.color);
        System.out.println(v.speed);
        System.out.println(v.getYear());
        System.out.println(v.getModel());
    }

    public boolean isSpeeding(Voiture v) {
        if (v.speed < 20) {
            return false;
        } else {
            return true;
        }
    }

    public boolean ifTotalLoss(Voiture v) {
        if (v.getYear() < 2000) {
            return true;
        } else {
            return false;
        }
    }

    public String soundOfEngine(Voiture v) {
        return v.sound = (isSpeeding(v)) ? "Veeeeeeer Veeeeeeeer" : "tiikk tiikk tiikk";
    }

    public String statusOfCar(Voiture v){
        return  v.carStatus = (ifTotalLoss(v)) ? "loss ":" Repair";
    }

    public static void main(String[] args) throws Exception {
        Voiture v = new Voiture();
        v.displayVoiture(v);
        v.setSpeed(25);
        v.soundOfEngine(v);
        System.out.println(v.sound);
        v.statusOfCar(v);
        System.out.println(v.carStatus);
    }
}
