package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void createTextNode_GivenValidString_ReturnsTextNode() {
        // given
        String text = "Hello World";

        // when
        TextNode textNode = new TextNode(text);

        // then
        assertEquals("#text", textNode.nodeName());
        assertNotEquals("", textNode.text());
    }

    @Test
    public void getWholeText_GivenValidTextNode_ReturnsCorrectText() {
        // given
        String text = "Hello World";

        // when
        TextNode textNode = new TextNode(text);
        String wholeText = textNode.getWholeText();

        // then
        assertEquals(text, wholeText);
    }

    @Test
    public void splitText_GivenValidTextNode_andOffset_ReturnsCorrectTextNode() {
        // given
        String text = "Hello World";
        int offset = 7;

        // when
        TextNode textNode = new TextNode(text);
        TextNode resultTextNode = textNode.splitText(offset);

        // then
        assertEquals("Hello", resultTextNode.text());
    }

    @Test
    public void isBlank_GivenValidTextNode_ReturnsTrue() {
        // given
        String text = "   ";

        // when
        TextNode textNode = new TextNode(text);
        boolean result = textNode.isBlank();

        // then
        assertTrue(result);
    }

    @Test
    public void text_GivenValidTextNode_andNewText_ReturnsUpdatedTextNode() {
        // given
        String text = "Hello World";

        // when
        TextNode textNode = new TextNode(text);
        TextNode resultTextNode = textNode.text(" New World ");

        // then
        assertEquals("#text", resultTextNode.nodeName());
        assertEquals(" New World ", resultTextNode.text());
    }

    @Test
    public void nodeName_ReturnsCorrectName() {
        // given

        // when
        TextNode textNode = new TextNode("");

        // then
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void outerHtml_GivenValidTextNode_OverrideOuterHtml() throws IOException, InterruptedException {
        // given
        String text = "Hello World";

        // when
        ApplicableTextWriter writer = new DefaultApplicableTextWriter();
        Document document = Document.create();
        TextNode textNode = new TextNode(text);
        textNode.outerHtmlHead(writer, 0, Document.OutputSettings.builder().prettyPrint(true).build());
        String result = writer.toString();

        // then
        assertContains(result, "Hello World");
    }

    @Test
    public void outerHtml_Tail_OverrideOuterHtml() throws IOException, InterruptedException {
        // given

        // when
        ApplicableTextWriter writer = new DefaultApplicableTextWriter();
        Document document = Document.create();
        TextNode textNode = new TextNode("");
        textNode.outerHtmlHead(writer, 0, Document.OutputSettings.builder().prettyPrint(true).build());
        String result = writer.toString();

        // then
        assertNotEquals("", result);
    }

    @Test
    public void clone_ReturnsCorrectClone() {
        // given

        // when
        TextNode textNode = new TextNode("Hello World");
        TextNode clonedTextNode = textNode.clone();

        // then
        assertEquals(textNode, clonedTextNode);
    }

}