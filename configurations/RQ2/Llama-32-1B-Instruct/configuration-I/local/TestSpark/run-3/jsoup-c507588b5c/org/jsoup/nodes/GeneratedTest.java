package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void shouldCreateTextNode() {
        assertEquals("text", TextNode.class.getName().substring(6));
    }

    @Test
    public void shouldGetWholeText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getText());
    }

    @Test
    public void shouldIsBlank() {
        assertTrue(TextNode.isBlank());
        assertFalse(TextNode.isBlank());
    }

    @Test
    public void shouldSplitText() throws IOException {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        String result1 = textNode.splitText(0).getText();
        String result2 = textNode.splitText(7).getText();
        assertEquals("World", result1);
        assertEquals("Hello World", result2);
    }

    public class AppendableMock implements Appendable {
        @Override
        public void append(CharSequence csq) throws IOException {
            // return a string buffer with the given character sequence
        }

        @Override
        public void append(char c) throws IOException {
            // do nothing, just allow this method to be called
        }
    }

    public class DocumentOutputSettingsMock implements Document.OutputSettings {
        @Override
        public OutputSettings outputSettings() {
            return null;
        }
    }

    @Test
    public void outerHtmlHeadMock() throws IOException {
        Appendable accum = new AppendableMock();
        Document.OutputSettings out = new DocumentOutputSettingsMock();

        TextNode textNode = new TextNode("Hello World");
        outerHtmlHead(accum, 0, out);
        verify(accum, times(1)).append(anyString());
    }

    @Test
    public void outerHtmlTailMock() throws IOException {
        Appendable accum = new AppendableMock();
        Document.OutputSettings out = new DocumentOutputSettingsMock();

        TextNode textNode = new TextNode("Hello World");
        outerHtmlHead(accum, 0, out);
        verify(accum, times(1)).append(anyString());

        when(out.output()).thenReturn(mock(Document.OutputSettings.class).withOutputSettings(any()));
    }

    @Test
    public void toStringMock() {
        Document.OutputSettings out = new DocumentOutputSettingsMock();

        TextNode textNode = new TextNode("Hello World");
        assertEquals("text", textNode.toString());
    }

    @Test
    public void cloneMock() throws IOException {
        Document.OutputSettings out = new DocumentOutputSettingsMock();
        TextNode textNode = new TextNode("Hello World");

        String clonedText = (String) textNode.clone().getText();
        assertEquals(textNode.getText(), clonedText);

        when(out.output()).thenReturn(mock(Document.OutputSettings.class).withOutputSettings(any()));
    }

    @Test
    public void createFromEncodedMock() throws Exception {
        String encodedText = "Hello World";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("text", textNode.getText());

        verify(mock(TextNode.class), times(1)).createFromEncoded(encodedText);
    }

}