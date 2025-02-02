package org.jsoup.nodes;

public class GeneratedOuterHtmlReturnsString {

    @Test
    public void outerHtmlReturnsString() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable appendable = outContent;
        String result = node.outerHtml(appendable);
        assertEquals(String.valueOf(node), result);
    }
}

public class OutputSettingsTest {
    private OutputSettings settings;

    public OutputSettingsTest(OutputSettings settings) {
        this.settings = settings;
    }

}