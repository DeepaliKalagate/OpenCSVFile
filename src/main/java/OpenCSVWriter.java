import com.opencsv.CSVWriter;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OpenCSVWriter
{
    private static final String STRING_ARRAY_SAMPLE="/home/admin1/Desktop/user.csv";

    public static void main(String[] args) throws IOException {
        try
                (
                        Writer writer= Files.newBufferedWriter(Paths.get(STRING_ARRAY_SAMPLE));
                        CSVWriter csvWriter=new CSVWriter(writer,CSVWriter.DEFAULT_SEPARATOR,CSVWriter.NO_QUOTE_CHARACTER,CSVWriter.DEFAULT_ESCAPE_CHARACTER,CSVWriter.DEFAULT_LINE_END);
                )
        {
            String[] headerRecord={"Name","Email","Phono","Country"};
            csvWriter.writeNext(headerRecord);

            csvWriter.writeNext(new String[]{"Lokesh Patil","lokesh.patil@gamil.com","+91 7089656890","India"});
            csvWriter.writeNext(new String[]{"Deepali Patil","dipakalagate@gmail.com","+91 8412989861","America"});
        }
    }
}
