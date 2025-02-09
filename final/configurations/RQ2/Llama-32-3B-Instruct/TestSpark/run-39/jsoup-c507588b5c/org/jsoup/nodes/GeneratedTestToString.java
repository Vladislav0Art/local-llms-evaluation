package org.jsoup.nodes;

public class GeneratedTestToString {

    private TextNode node;

    public GeneratedTest() {
        this.node = new TextNode();
    }

    @Test
    public void testToString() {
        TextNode node = new TextNode("Hello\nWorld");
        String expected = "<p> Hello<br> World </p>";
        String actual = node.toString();
        assertEquals(expected, actual);
    }
}

public class Document {

    public static class OutputSettings {
    }

    public static class TestUtil {
    }

}