package homework;

public class Main {

    public static void main(String[] args) {
        BMW bmw = new BMW("BMW",2020,Color.SILVER,new Engine(5.0),"автомат");
        System.out.println(bmw.getInfo());
        bmw.makeVoice("vuuuuuuu");
        bmw.speed(340);

        Lexus es = new Lexus("es350",2013,Color.BLACK,new Engine(3.5),"автомат",
                "comfort+");
        es.speed(100);
        System.out.println(es.getInfo());
        Lexus gs = new Lexus("gs300",2008,Color.WHITE,new Engine(3.5),"механика",
                "comfort++");
        gs.speed(120);
        System.out.println(gs.getInfo());



    }
}
