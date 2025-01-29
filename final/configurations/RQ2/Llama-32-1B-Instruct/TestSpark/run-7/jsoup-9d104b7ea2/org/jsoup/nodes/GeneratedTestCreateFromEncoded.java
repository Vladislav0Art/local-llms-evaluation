package org.jsoup.nodes;

public class GeneratedTestCreateFromEncoded {

    @Test
    public void testCreateFromEncoded() throws IOException {
        MockDocument mockDocument = new MockDocument();
        mockDocument.appendText("Hello World");
        TextNode textNode = new TextNode.createFromEncoded("Hello World");
        assertEquals(mockDocument.toString(), textNode.getText());
    }

    static class MockDocument extends Document {
        public Appendable appendText(String content) {
            return null;
        }
    }

}