package org.jsoup.nodes;

public class GeneratedTestOuterHtmlReturnsString {

    private Node node;

    public NodeTest(Node node) {
        this.node = node;
    }

    @Test
    public void testOuterHtmlReturnsString() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable appendable = outContent;
        String result = node.outerHtml(appendable);
        assertEquals(node.toString(), result);
    }
}

public class OutputSettingsTest {
    private OutputSettings settings;

    public OutputSettingsTest(OutputSettings settings) {
        this.settings = settings;
    }

}