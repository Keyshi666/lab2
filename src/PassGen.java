import java.util.Random;


public class PassGen {
    public String getPass(int passl){
        String pass = "";
        for(int i =0; i<passl; ++i){
            pass+= (char)rand('A', 'Z');
            rand('A', 'Z');}
        return pass;
    }
     int rand(int min, int max)
    {
        Random rand = new Random();
        return min + (rand.nextInt(max - min + 1));
    }
}
