package pl.mareksliwinski;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile {

    String fileName = "fileName";
    File file = new File(fileName);

    //Getter
    public File getFile() {
        return file;
    }

    void outputFile(String dataToSave){

        try {
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.flush();
            bw.write(dataToSave);
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}