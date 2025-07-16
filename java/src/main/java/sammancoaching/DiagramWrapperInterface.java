package sammancoaching;

public interface DiagramWrapperInterface {
    boolean copyPdf(DiagramWrapperInterface diagram, DiagramMetadata info, String targetFilename);

    String getName();

    String getSerialNumber();

    String getSummaryInformation();

    PngDocument getFlowchartThumbnail();
}
