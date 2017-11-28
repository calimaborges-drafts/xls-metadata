package calimaborges;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;

public class ExcelMetadataExtractor {

    private final String filename;
    private HSSFWorkbook workbook;

    public ExcelMetadataExtractor(String filename) {
        this.filename = filename;
    }

    public void prepare() throws URISyntaxException, IOException {
        workbook = new HSSFWorkbook(
                new FileInputStream(
                        new File(
                                ClassLoader.getSystemResource(filename).toURI()
                        )
                )
        );
    }

    public String getAuthor() {
        return workbook.getSummaryInformation().getAuthor();
    }
}
