public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV Ligada: " +smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);  
        
        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarCanal();
        smartTv.aumentarVolume();
        smartTv.aumentarCanal();
        smartTv.diminuirVolume();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(80);

        System.out.println("TV Ligada: " +smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);  
    }
    
    
}
