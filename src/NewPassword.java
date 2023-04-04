import java.util.* ;

public class NewPassword {
    public static String NewPasswords()
    {
        Password pass = new Password();
        Random r = new Random();
        ArrayList<String> oldpass = new ArrayList<>();
        oldpass.add(pass.Number(1));
oldpass.add(pass.LowCase(1));
        oldpass.add(pass.UpperCase(1));
        oldpass.add(pass.SpCh(1));
        for(int i=4 ;i<8;i++) {
         int count =  r.nextInt(1,4) ;
            if(count==1) oldpass.add(pass.Number(1));
            if(count==2) oldpass.add(pass.LowCase(1));
            if(count==3) oldpass.add(pass.UpperCase(1));
            if(count==4) oldpass.add(pass.SpCh(1));


        }
String z ="" ;
        String str = "";
        int y = 0;
        for(int i=0 ;i< oldpass.size();)
        {
            int x = oldpass.indexOf(oldpass.get(r.nextInt(oldpass.size())));


                    str = str+ oldpass.get(x);

          y=x ;

            oldpass.remove(y);


        }
        return str ;


    }
}
