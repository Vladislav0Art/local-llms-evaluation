package org.jsoup.nodes;

public class GeneratedTest {

    public static class Document {
        public interface OutputSettings {
            String outerHtmlHead(Appendable accum, int depth, OutputSettings out);

            String outerHtmlTail(Appendable accum, int depth, OutputSettings out);
        }
    }

    @Test
    public void textNodeConstructorTestsTextContent() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.text());
    }

    @Test
    public void textNodeTextSetterTestsCorrectlySettingValue() {
        String text = "Hello World";
        TextNode textNode = new TextNode("");
        textNode.text(text);
        assertEquals(text, textNode.text());
    }

    @Test
    public void textNodeGetWholeTextTestsReturnsCorrectContent() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

    @Test
    public void textNodeIsBlankTestsReturnsFalseWithNonBlankString() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void textNodeSplitTextTestsCorrectlySplitsString() {
        String text = "Hello,World!";
        TextNode textNode = new TextNode(text);
        int offset = 7;
        TextNode tailNode = textNode.splitText(offset);
        assertEquals("World!", tailNode.text());
        assertEquals("Hello,", textNode.getWholeText());
    }

    @Test
    public void textNodeToStringTestsReturnsCorrectString() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals("<p>Hello World</p>", textNode.toString());
    }

}