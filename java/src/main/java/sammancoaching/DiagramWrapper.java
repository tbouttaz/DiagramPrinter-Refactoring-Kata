package sammancoaching;

public class DiagramWrapper implements SummarizableDiagram {

    private final FlowchartDiagram diagram;

    public DiagramWrapper(FlowchartDiagram diagram) {
        this.diagram = diagram;
    }

    @Override
    public PngDocument getFlowchartThumbnail() {
        return getDiagram().getFlowchartThumbnail();
    }

    @Override
    public String getSummaryInformation() {
        return getDiagram().getSummaryInformation();
    }

    @Override
    public String getSerialNumber() {
        return getDiagram().getSerialNumber();
    }

    @Override
    public String getName() {
        return getDiagram().getName();
    }

    public FlowchartDiagram getDiagram() {
        return diagram;
    }
}
