package calimaborges;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;

public class ExcelMetadataExtractor {

    private final File file;
    private HSSFWorkbook workbook;

    public ExcelMetadataExtractor(File file) {
        this.file = file;
    }

    public void prepare() throws URISyntaxException, IOException {
        workbook = new HSSFWorkbook(
                new FileInputStream(
                        file
                )
        );
    }

    public String getAuthor() {
        return workbook.getSummaryInformation().getAuthor();
    }
}
