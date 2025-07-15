package sammancoaching;

public class MockDiagramWrapper implements DiagramWrapperInterface {
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
