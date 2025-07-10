package sammancoaching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

public class DiagramPrinterTest {

    @Test
    public void translatingEmptyDocumentFails() {
        DiagramPrinter printer = new DiagramPrinter();
        StringBuilder output = new StringBuilder();
        boolean result = printer.printSummary(null, "swedish", output);
        assertEquals("", output.toString());
        assertFalse(result);
    }

    @Test
    public void translateDocument() {
        DiagramPrinter printer = new DiagramPrinter();
        StringBuilder output = new StringBuilder();
        SummarizableDiagram mockDiagram = new MockDiagram();

        boolean result = printer.printSummary(mockDiagram, "swedish", output);

        assertTrue(result);
        assertTrue(output.toString().contains(mockDiagram.getName() + "\n" + mockDiagram.getSerialNumber() + "\n"));
        assertEquals("""
                Name
                SerialNumber
                SummaryInformation
                FlowchartThumbnail.png""", output.toString());
    }

    @Test
    public void printingEmptyDocumentFails() throws IOException {
        DiagramPrinter printer = new DiagramPrinter();
        boolean result = printer.printDiagram(null, null, null);
        assertFalse(result);
    }
}

