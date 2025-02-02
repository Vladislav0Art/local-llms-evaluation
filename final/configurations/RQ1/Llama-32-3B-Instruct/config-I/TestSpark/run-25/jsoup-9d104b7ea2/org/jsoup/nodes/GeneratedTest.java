package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.mockito.Mockito;

public class GeneratedTest {

    private TextNode textNode;

    @Before
    public void setup() {
        textNode = new TextNode("");
    }

    public TextNodeMethodUnderTestTest(String method) {
        this.method = method;
    }

    public String methodName() {
        return "[MethodUnderTest]" + method + "Test";
    }

    @Test
    public void createTextNode_StringText

    CreatesTextNodeWithCorrectValue() throws IOException {
        assertSame(textNode, new TextNode("test"));
    }

    @Test
    public void nodeName_ReturnsCorrectString() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void text_ReturnsCorrectNormalisedString() {
        assertEquals(StringUtil.normaliseWhitespace("   "), StringUtil.normaliseWhitespace(textNode.text()));
    }

    @Test
    public void textAssignsCorrectValueToTextNode() {
        String value = "test";
        textNode.text(value);
        assertEquals(value, textNode.text());
    }

    @Test
    public void getWholeText_ReturnsCorrectString() {
        assertEquals("test", textNode.getWholeText());
    }

    @Test
    public void isBlank_ReturnsCorrectBooleanValue() {
        assertTrue(textNode.isBlank());
        textNode = new TextNode(" ");
        assertFalse(textNode.isBlank());
        textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void splitText_CreatesTextNodeWithCorrectValueAndParentNode() throws IOException {
        TextNode tailNode = textNode.splitText(5);
        assertNotNull(tailNode.parentNode());
        assertEquals(6, tailNode.text().length());
    }
}

public class TextNodeMethodUnderTestTest extends TextNodeTest {

    public TextNodeMethodUnderTestTest(String method) {
        super(method);
    }

    @Override
    public String methodName() {
        return "createTextNode" + super.methodName();
    }

    @Test
    public void createTextNode_fromEncoded_StringEncodesCorrectly() throws IOException {
        String encodedText = "&lt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<", textNode.text());
    }
}

public class TextNodeStaticMethodUnderTestTest extends TextNodeTest {

    public TextNodeStaticMethodUnderTestTest(String method) {
        super(method);
    }

    @Override
    public String methodName() {
        return "normaliseWhitespace" + super.methodName();
    }

    @Test
    public void normaliseWhitespace_RemovesLeadingAndTrailingWhitespacesCorrectly() {
        assertEquals("test", TextNode.normaliseWhitespace("   test"));
        assertEquals("", TextNode.stripLeadingWhitespace(""));
        assertEquals(StringUtil.normaliseWhitespace("  "), StringUtil.normaliseWhitespace("   "));
    }

    @Test
    public void lastCharIsWhitespace_ReturnsCorrectBooleanValue() {
        assertTrue(TextNode.lastCharIsWhitespace(new StringBuilder(" ")));
        assertFalse(TextNode.lastCharIsWhitespace(new StringBuilder("abc")));
    }

}