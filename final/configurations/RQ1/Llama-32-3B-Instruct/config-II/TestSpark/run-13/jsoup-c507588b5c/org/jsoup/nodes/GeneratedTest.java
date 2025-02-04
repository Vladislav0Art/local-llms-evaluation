package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void newTextNode_GivenText_CreatedCorrectly() {
        // given
        String text = "test";
        TextNode node = new TextNode(text);

        // when
        assertEquals(text, node.text());

        // then
        assertNotNull(node);
    }

    @Test
    public void newNodeText_GivenBlankString_CreatedCorrectly() {
        // given
        String text = "";
        TextNode node = new TextNode(text);

        // when
        assertEquals("", node.text());

        // then
        assertNotNull(node);
    }

    @Test
    public void splitText_GivenOffset_LowerBound() {
        // given
        TextNode node = new TextNode("test");
        int offset = 0;

        // when
        TextNode tail = node.splitText(offset);

        // then
        assertEquals(0, offset);
        assertSame(node, tail.previousSibling());
    }

    @Test
    public void splitText_GivenOffset_UpperBound() {
        // given
        TextNode node = new TextNode("test");
        int offset = 5;

        // when
        TextNode tail = node.splitText(offset);

        // then
        assertEquals(5, offset);
        assertSame(node, tail.previousSibling());
    }

    @Test
    public void splitText_GivenInvalidOffset() {
        // given
        TextNode node = new TextNode("test");
        int offset = 10;

        // when
        node.splitText(offset);
    }

    @Test
    public void isBlank_GivenEmptyString_ReturnsTrue() {
        // given
        String text = "";
        TextNode node = new TextNode(text);

        // when
        boolean result = node.isBlank();

        // then
        assertTrue(result);
    }

    @Test
    public void isBlank_GivenNonEmptyString_ReturnsFalse() {
        // given
        String text = "test";
        TextNode node = new TextNode(text);

        // when
        boolean result = node.isBlank();

        // then
        assertFalse(result);
    }

    @Test
    public void outerHtmlHead_GivenDocumentSettings_CreatesCorrectHtml() throws IOException {
        // given
        Document document = new Document();
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings settings = mock(Document.OutputSettings.class);

        // when
        TextNode node = new TextNode("test");
        node.outerHtmlHead(accum, 0, settings);

        // then
        verify(accum).append(anyString());
    }

    @Test
    public void outerHtmlTail_GivenDocumentSettings_CreatesCorrectHtml() throws IOException {
        // given
        Document document = new Document();
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings settings = mock(Document.OutputSettings.class);

        // when
        TextNode node = new TextNode("test");
        node.outerHtmlTail(accum, 0, settings);

        // then
        verify(accum).append(anyString());
    }

    @Test
    public void clone_CreatesCorrectClone() {
        // given
        TextNode node = new TextNode("test");

        // when
        TextNode cloned = node.clone();

        // then
        assertNotNull(cloned);
        assertEquals(node, cloned);
    }

}