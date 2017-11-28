package calimaborges;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class App {
    public static void main(String args []) throws IOException, URISyntaxException {
        if (args.length < 1) {
            System.err.println("uso: java -jar xls-metadata <local/do/arquivo>");
            return;
        }

        String filepath = args[0];
        ExcelMetadataExtractor excelMetadataExtractor = new ExcelMetadataExtractor(new File(filepath));
        excelMetadataExtractor.prepare();
        System.out.println(excelMetadataExtractor.getAuthor());
    }
}
