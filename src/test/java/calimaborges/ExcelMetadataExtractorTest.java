package calimaborges;

import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;

public class ExcelMetadataExtractorTest {

    @Test
    public void shouldExtractName() throws IOException, URISyntaxException {
        ExcelMetadataExtractor excelMetadataExtractor = new ExcelMetadataExtractor("teste.xls");
        excelMetadataExtractor.prepare();
        assertEquals("Saulo de Souza Guerra Ferreira de Castro", excelMetadataExtractor.getAuthor());
    }

}
