package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
    }

    @Test
    public void createTextNode_NullText_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new TextNode(null));
    }

    @Test
    public void nodeName_GivenTextNode_ReturnsNodesName() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void text_GivenTextNode_ReturnsTextContent() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello World", textNode.text());
    }

    @Test
    public void text_GivenEncodedText_ReturnsUnencodedTextContent() throws IOException {
        String encodedText = "&lt;Hello&gt; World";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("&lt;Hello&gt; World", textNode.text());
    }

    @Test
    public void isBlank_GivenTextNode_ReturnsTrue() {
        String text = "   ";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_GivenNonBlankTextNode_ReturnsFalse() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText_GivenTextNode_GivenOffset_ReturnsNewTextNode() throws IOException {
        String text = "Hello\nWorld";
        int offset = 5;
        TextNode textNode = new TextNode(text);
        TextNode result = textNode.splitText(offset);
        assertNotNull(result);
    }

    @Test
    public void splitText_NegativeOffset_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new TextNode("Hello World").splitText(-1));
    }

    @Test
    public void splitText_LargerOffsetThanTextLength_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new TextNode("Hello World").splitText(10));
    }
}

public class MockitoTextNodeTest {

    @Mock
    private Appendable accum;

    @InjectMocks
    private TextNode textNode;

    @Before
    public void setup() throws IOException {
        MockitoAnnotations.initFields(this);
        textNode = new TextNode("Hello World");
    }

    @Test
    public void outerHtmlHead_MocksEntitiesEscapeToReturnAccumulatedText() throws IOException, InterruptedException {
        //given
        when(accum.append(anyString())).thenAnswer(i -> {
            String s = i.getArgumentAt(0);
            return s.equals(textNode.text());
        });

        //when
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlHead(accum, 1, out);

        //then
        verify(accum).append("Hello World");
    }

    @Test
    public void outerHtmlTail_MocksEntitiesEscapeToReturnEmptyString() throws IOException {
        //given
        when(accum.append(anyString())).thenAnswer(i -> {
            String s = i.getArgumentAt(0);
            return "";
        });

        //when
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlTail(accum, 1, out);

        //then
        verify(accum).append("");
    }

    @Test
    public void toString_MocksOuterHtmlToReturnStringRepresentation() throws IOException {
        //given
        when(accum.append(anyString())).thenAnswer(i -> {
            String s = i.getArgumentAt(0);
            return s.equals("Hello World");
        });

        //when
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtml(out);

        //then
        verify(accum).append("Hello World");
    }

    @Test
    public void clone_MocksCloneToReturnClonedTextNode() {
        //given
        TextNode clone = new TextNode("Hello World");

        //when
        TextNode result = textNode.clone();

        //then
        assertNotNull(result);
        assertEquals(clone, result);
    }

}