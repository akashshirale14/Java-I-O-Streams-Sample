import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args) throws IOException{
        FileReader fr = null;
        FileWriter fw = null;
        try{
            fr= new FileReader("/Users/akashshirale/Documents/myText.txt");
            fw = new FileWriter("/Users/akashshirale/Documents/thisOutput.txt");
            int c;
            while((c=fr.read())!=-1){
                System.out.println(c);
                fw.write(c);
            }
        }catch(FileNotFoundException fnfEx){
            System.out.println(fnfEx);
        }catch(IOException ioEx){
            System.out.println(ioEx);
        }finally {
            if(fr!=null){
                fr.close();
            }
            if(fw!=null){
                fw.close();
            }
        }
    }
}
