package org.jsoup.nodes;

public class GeneratedTest {

    private TextNode textNode;

    @Before
    public void setup() {
        textNode = new TextNode("Some text");
    }

    @Test
    public void testNodeName() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void testText() {
        assertEquals("Some text", textNode.text());
    }

    @Test
    public void testGetWholeText() {
        assertEquals("Some text", textNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        assertFalse(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode splitTextNode = textNode.splitText(5);
        assertEquals("Some ", textNode.getWholeText());
        assertEquals("text", splitTextNode.getWholeText());
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        Appendable accum = mock(Appendable.class);

        textNode.outerHtmlHead(accum, 0, Document.OutputSettings.create());

        verify(accum).append("Some text");
    }

    @Test
    public void testOuterHtmlTail() {
        // no-op
    }

    @Test
    public void testToString() {
        assertEquals("Some text", textNode.toString());
    }

    @Test
    public void testClone() {
        TextNode clone = textNode.clone();

        assertNotSame(textNode, clone);
        assertEquals(textNode.getWholeText(), clone.getWholeText());
    }

    @Test
    public void testCreateFromEncoded() {
        TextNode encodedTextNode = TextNode.createFromEncoded("&lt;");

        assertEquals("<", encodedTextNode.getWholeText());
    }

}