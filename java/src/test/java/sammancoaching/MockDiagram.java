package sammancoaching;

public class MockDiagram implements SummarizableDiagram {
    @Override
    public PngDocument getFlowchartThumbnail() {
        return new PngDocument("FlowchartThumbnail.png");
    }

    @Override
    public String getSummaryInformation() {
        return "SummaryInformation";
    }

    @Override
    public String getSerialNumber() {
        return "SerialNumber";
    }

    @Override
    public String getName() {
        return "Name";
    }
}
