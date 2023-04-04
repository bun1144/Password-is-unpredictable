import java.util.Random;

public class Password {


    public static String Number(int n) {
        String number = ""  ;

        Random r = new Random();

        for(int i =0;i<n;i++)
        {
            int c =  r.nextInt(9) ;
            number = number + c;
        }
        return number ;

    }

    public static String LowCase(int l) {
        String up = ""  ;


        Random r = new Random();

        for (int i = 0; i < l; i++) {
            char c = (char) (r.nextInt(26) + 'a');
            up = up + c;
        }
        return up ;

    }
    public static String SpCh(int s) {
        String speacialChars = "~!@# %^&*()-_=+[{]}\\|;:\'&#;,<.>/?";

        String sp ="";
        Random r = new Random();


        for (int i = 0; i < s; i++) {
            sp += speacialChars.charAt(r.nextInt(speacialChars.length()));
        }

       return sp ;


    }


    public static String UpperCase(int u)
    {
        String up = ""  ;


        Random r = new Random();

        for (int i = 0; i < u; i++) {
            char a= (char) (r.nextInt(26) + 'A');
            up = up + a;
        }
       return up ;

    }








}

