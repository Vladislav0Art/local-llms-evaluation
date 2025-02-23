package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void textNode_CreateFromEncoded_UnencodedData() {
        TextNode textNode = new TextNode("&lt;");
        String expected = "<";
        String actual = textNode.text();
        assertEquals(expected, actual);
    }

    @Test
    public void textNode_GetWholeText_CompleteText() {
        TextNode textNode = new TextNode("Hello World");
        String expected = "Hello World";
        String actual = textNode.getWholeText();
        assertEquals(expected, actual);
    }

    @Test
    public void textNode_IsBlank_EmptyOrWhiteSpaceOnly() {
        TextNode textNode = new TextNode("   ");
        boolean expected = true;
        boolean actual = textNode.isBlank();
        assertEquals(expected, actual);
    }

    @Test
    public void textNode_SplitText_NewTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode expected = new TextNode(" World");
        TextNode actual = textNode.splitText(5);
        assertEquals(expected.getWholeText(), actual.getWholeText());
    }

    @Test
    public void textNode_OuterHtmlHead_NoIndent() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        Appendable accum = mock(Appendable.class);
        doNothing().when(accum).append("Hello World");
        textNode.outerHtmlHead(accum, 0, Document.OutputSettings.create().prettyPrint(false));
        verify(accum).append("Hello World");
    }

}