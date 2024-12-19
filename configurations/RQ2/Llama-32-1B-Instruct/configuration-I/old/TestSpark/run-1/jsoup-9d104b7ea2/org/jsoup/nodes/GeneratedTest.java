package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import java.util.function.Function;

public class GeneratedTest {

    @Test
    public void test_blank() {
        Document document = new Document();
        TextNode textNode = TextNode.createFromEncoded("");
        assertEquals(false, textNode.isBlank());
    }

    @Test
    public void test_splitText_empty() {
        Document document = new Document();
        String[] expected = {"", ""};
        Function<TextNode, TextNode> split = createSplitFunction();
        TextNode result = document.createTextNode(split.apply(document.getText()));
        assertEquals(expected[0], result.text());
        assertEquals(expected[1], split.apply(result));
    }

    @Test
    public void test_splitText_nonEmpty() {
        Document document = new Document();
        String[] expected = {"<p>This is a sample text.</p>", "<p>and this is another one.</p>"};
        Function<TextNode, TextNode> split = createSplitFunction();
        for (String str : expected) {
            result = document.createTextNode(split.apply(str));
            assertEquals(expected.length, result.text().length());
        }
    }

    @Test
    public void test_outerHtmlHead_appendable() {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        document.outerHtmlHead(accum, 0);
        assertEquals("Hello World", accum.toString());
    }

    @Test
    public void test_outerHtmlTail_appendable() {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        document.outerHtmlTail(accum, 0);
        assertEquals("", accum.toString());
    }

    @Test
    public void test_stringToString() {
        String string = "Hello World";
        TextNode textNode = TextNode.createFromEncoded(string);
        assertEquals("Hello World", textNode.toString());
    }

    @Test
    public void test_clone() {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        TextNode originalTextNode = document.createTextNode("Original Text");
        append(originalTextNode, accum, 0);
        originalTextNode = (TextNode) document.cloneNode(true).addChild(originalTextNode);
        assertEquals(originalTextNode, document.getText().toString());
    }

    @Test
    public void testcreateFromEncoded_unescape() {
        Document document = new Document();
        String encodedText = "&lt;p&gt;This is a sample text.&lt;/p&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<p>This is a sample text.</p>", textNode.text());
    }

    @Test
    public void test_normaliseWhitespace_empty() {
        String string = "";
        String normalised = normaliseWhitespace(string);
        assertEquals("", normalised);
    }

    @Test
    public void test_normaliseWhitespace_singleSpace() {
        String string = "  ";
        String normalised = normaliseWhitespace(string);
        assertEquals(" ", normalised);
    }

    private static Function<TextNode, TextNode> createSplitFunction() {
        return (TextNode textNode) -> {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < textNode.text().length(); i++) {
                if (i == textNode.text().length() - 1 || textNode.text().charAt(i) != ' ') {
                    sb.append(textNode.text().charAt(i));
                }
            }
            return new TextNode(sb.toString());
        };
    }

}