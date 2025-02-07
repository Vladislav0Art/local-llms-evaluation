package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.util.List;

public class GeneratedTest {

    private TextNode textNode = new TextNode("Hello World");

    @Test
    public void testnodeName() {
        assertEquals("TEXT_NODE", textNode.nodeName());
    }

    @Test
    public void testText() {
        String result = textNode.text();
        assertEquals("Hello World", result);
    }

    @Test
    public void testTextConcatenation() {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        String expectedResult = "Hello World";
        when(textNode.getWholeText()).thenReturn(strings.stream().collect(Collectors.joining()));
        assertEquals(expectedResult, textNode.getText());
    }

    @Test
    public void testIsBlank() {
        assertTrue(textNode.isBlank());
    }

    @Test
    public void testSplitText() {
        String result = textNode.splitText(0);
        assertEquals("Hello World", result);
        when(mockitoMockery.anyInt()).thenReturn(0);
    }

    @Test
    public void testOuterHtmlHead() {
        Document document = mock(Document.class);
        Appendable output = mock(Appendable.class);
        when(document.getOutputStream()).thenReturn(output);
        when(textNode.outerHtmlHead(any(Appendable.class), anyInt(), anyDocument.OutputSettings.class)).thenReturn("Hello World");
        textNode.outerHtmlHead(document, 0, null);
        verify(output).append("Hello World");
    }

    @Test
    public void testOuterHtmlTail() {
        Document document = mock(Document.class);
        Appendable output = mock(Appendable.class);
        when(document.getOutputStream()).thenReturn(output);
        when(textNode.outerHtmlTail(any(Appendable.class), anyInt(), anyDocument.OutputSettings.class)).thenReturn("Hello World");
        textNode.outerHtmlTail(document, 0, null);
        verify(output).append("Hello World");
    }

    @Test
    public void testToString() {
        assertEquals("TEXT_NODE", textNode.toString());
    }

    @Test
    public void testClone() {
        TextNode clone = textNode.clone();
        assertEquals(textNode, clone);
    }

    @Test
    public void testcreateFromEncoded() {
        String encodedText = "Hello World";
        TextNode result = textNode.createFromEncoded(encodedText);
        assertEquals("Hello World", result.getText());
    }

    @Test
    public void testNormaliseWhitespace() {
        List<String> strings = new ArrayList<>();
        strings.add(List.of("   ", "Hello"));
        String expectedResult = "Hello ";
        when(textNode.stripLeadingWhitespace(any(StringBuilder.class))).thenReturn(expectedResult);
        assertEquals(expectedResult, textNode.getWholeText());
    }

    @Test
    public void testStripLeadingWhitespace() {
        List<String> strings = new ArrayList<>();
        strings.add(List.of("   ", "Hello"));
        String expectedResult = "Hello";
        when(textNode.stripLeadingWhitespace(any(StringBuilder.class))).thenReturn(expectedResult);
        assertEquals(expectedResult, textNode.getWholeText());
    }

    @Test
    public void testLastCharIsWhitespace() {
        List<String> strings = new ArrayList<>();
        strings.add(List.of("   ", ""));
        String expectedResult = true;
        when(textNode.lastCharIsWhitespace(any(StringBuilder.class))).thenReturn(expectedResult);
        assertEquals(true, textNode.getLastCharIsWhitespace(strings.get(0).stream().collect(Collectors.toList())));
    }

}