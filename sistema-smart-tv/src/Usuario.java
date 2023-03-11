public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Status: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status: " + smartTv.ligada);

        smartTv.volSum();
        System.out.println("Volume Atual: " + smartTv.volume);
        smartTv.volSub();
        System.out.println("Volume Atual: " + smartTv.volume);
    }
}
