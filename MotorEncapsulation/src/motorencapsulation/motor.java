package motorencapsulation;

public class motor{
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if (kontakOn == true){
            kecepatan += 35;
            if(kecepatan >= 100){
                System.out.println("Kecepatan tidak bisa bertambah karena sudah dalam kondisi kecepatan maksimal \n");
            }else{

            }
        }else{
            System.out.println("Kecepata tidak bisa bertambah karena mesin Off! \n");
        }
    }
    public void kurangiKecepatan(){
        if (kontakOn == true){
            kecepatan -= 35;
        }else{
            System.out.println("Kecepata tidak bisa berkurang karena mesin Off! \n");
        }
    }
    
    public void printStatus(){
        if (kontakOn == true){
            System.out.println("Kontak On");
            if(kecepatan >= 100){
                System.out.println("Kecepatan tidak bisa bertambah karena sudah dalam kondisi kecepatan maksimal \n");
            }else{
                System.out.println("Kecepatan" + kecepatan + "\n");
            }
        }else{
            System.out.println("Kontak Off");
            System.out.println("Kecepatan" + kecepatan + "\n");
        }
      
    }
}