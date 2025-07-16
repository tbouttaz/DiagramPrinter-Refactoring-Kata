package sammancoaching;

public class DiagramWrapper implements DiagramWrapperInterface {
    private final FlowchartDiagram diagram;

    public DiagramWrapper(FlowchartDiagram diagram) {
        this.diagram = diagram;
    }

    @Override
    public boolean copyPdf(DiagramWrapperInterface diagram, DiagramMetadata info, String targetFilename) {
        return true;
        //FIXME
//        return diagram.getFlowchartAsPdf().copyFile(info.fullFilename, targetFilename, true);
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

    public SpreadsheetDocument getFlowchartDataAsSpreadsheet() {
        return diagram.getFlowchartDataAsSpreadsheet();
    }
}
