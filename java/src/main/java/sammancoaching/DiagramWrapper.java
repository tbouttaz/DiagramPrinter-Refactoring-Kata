package sammancoaching;

public class DiagramWrapper implements DiagramWrapperInterface {
    private final FlowchartDiagram diagram;

    public DiagramWrapper(FlowchartDiagram diagram) {
        this.diagram = diagram;
    }

    @Override
    public String getName() {
        return diagram.getName();
    }

    @Override
    public String getSerialNumber() {
        return diagram.getSerialNumber();
    }

    @Override
    public String getSummaryInformation() {
        return diagram.getSummaryInformation();
    }

    @Override
    public PngDocument getFlowchartThumbnail() {
        return diagram.getFlowchartThumbnail();
    }
}
