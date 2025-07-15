package sammancoaching;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiagramPrinterTest {

    @Test
    public void translatingEmptyDocumentFails() {
        DiagramPrinter printer = new DiagramPrinter();
        StringBuilder output = new StringBuilder();
        boolean result = printer.printSummary(null, "swedish", output);
        assertFalse(result);
    }

    @Test
    public void printingEmptyDocumentFails() throws IOException {
        DiagramPrinter printer = new DiagramPrinter();
        boolean result = printer.printDiagram(null, null, null);
        assertFalse(result);
    }

    @Test
    void buildSummary() {
        StringBuilder output = new StringBuilder();

        boolean result = new DiagramPrinter().buildSummary(new MockDiagramWrapper(), "swedish", output);

        assertEquals("""
                name
                SerialNumber
                SummaryInformation
                filename""", output.toString());
        assertTrue(result);
    }
}

