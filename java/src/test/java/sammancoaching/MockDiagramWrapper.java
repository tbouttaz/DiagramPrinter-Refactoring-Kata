package sammancoaching;

public class MockDiagramWrapper implements DiagramWrapperInterface {
    @Override
    public boolean copyPdf(DiagramWrapperInterface diagram, DiagramMetadata info, String targetFilename) {
        return true;
    }

    @Override
    public String getName() {
        return "name";
    }

    @Override
    public String getSerialNumber() {
        return "SerialNumber";
    }

    @Override
    public String getSummaryInformation() {
        return "SummaryInformation";
    }

    @Override
    public PngDocument getFlowchartThumbnail() {
        return new PngDocument("filename");
    }
}
