import java.io.*;

public class LineOrientedIO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter pw = null;
        try{
            br = new BufferedReader(new FileReader("/Users/akashshirale/Documents/myText.txt"));
            pw = new PrintWriter(new FileWriter("/Users/akashshirale/Documents/outputThree.txt"));

            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
                pw.print(line);
            }

        }catch(FileNotFoundException fnfEx){
            System.out.println(fnfEx);
        }catch(IOException ioEx){
            System.out.println(ioEx);
        }finally{
            if(br!=null){
                br.close();
            }
            if (pw != null) {
                pw.close();
            }
        }
    }
}
