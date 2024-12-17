package org.jsoup.nodes;

public class GeneratedToStringMock {

    @Test
    public void toStringMock() {
        Document.OutputSettings out = new DocumentOutputSettingsMock();

        TextNode textNode = new TextNode("Hello World");
        assertEquals("text", textNode.toString());
    }

}