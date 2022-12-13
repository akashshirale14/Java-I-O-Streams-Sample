import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis = new FileInputStream("/Users/akashshirale/Documents/myText.txt");
            fos = new FileOutputStream("/Users/akashshirale/Documents/myOutput.txt");
            int c;

            while((c=fis.read())!=-1){
                System.out.println(c);
                fos.write(c);
            }

        }catch(FileNotFoundException fnfEx){
            System.out.println(fnfEx);
        }catch(IOException ioEx){
            System.out.println(ioEx);
        }finally {
            if(fis!=null){
               fis.close();
            }
            if(fos!=null){
                fos.close();
            }
        }
    }
}
