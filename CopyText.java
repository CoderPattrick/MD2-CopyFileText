import java.io.*;

public class CopyText {
    public static void copyText(String path){
        String newPath="";
        char[] arr = path.toCharArray();
        for (int i = 0; i < arr.length-4; i++) {
            newPath+= arr[i];
        }
        newPath+="_clone.txt";
        try {
            File fileIn = new File(path);
            File fileOut = new File(newPath);
            if(fileOut.exists()){
                System.out.println("The Copy of this file is already exists!");
            }
            BufferedReader reader =new BufferedReader(new FileReader(fileIn));
            PrintWriter writer = new PrintWriter(fileOut);
            String line ="";
            while ((line = reader.readLine())!=null){
                    System.out.println(line);
                    writer.println(line);
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
