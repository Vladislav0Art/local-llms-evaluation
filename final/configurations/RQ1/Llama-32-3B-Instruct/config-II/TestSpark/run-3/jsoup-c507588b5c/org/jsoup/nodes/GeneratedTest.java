package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedTest {

    private TextNode textNode;
    private Document document;

    @Before
    public void setup() {
        // Create an empty document
        document = new Document();
        // Create a new text node with some test data
        textNode = new TextNode("This is a sample text");
        document.appendChild(textNode);
    }

    public static void setStdOutPrintStream(PrintStream printStream) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        PrintStream stdOut = new PrintStream(bos);
        System.setOut(stdOut);
        return stdOut;
    }

    public static void resetStdOutPrintStream() {
        PrintStream stdOut = System.out;
        System.setOut(null); // Reset to the default
    }

    @Test
    public void nodeName_ShouldReturnCorrectValue() {
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void text_ShouldReturnCorrectText() {
        String expectedText = "This is a sample text";
        assertEquals(expectedText, textNode.text());
    }

    @Test
    public void splitText_atOffsetOfZero_ShouldSplitAtBeginning() {
        TextNode newNode = textNode.splitText(0);
        assertEquals("This", newNode.text());
        assertSame(textNode, newNode.nextSibling());
    }

    @Test
    public void isBlank_ShouldReturnTrueIfEmptyOrWhitespace() {
        assertTrue(textNode.isBlank());
        // Create a new text node with only whitespace
        TextNode blankTextNode = new TextNode(StringUtil.normaliseWhitespace(""));
        assertTrue(blankTextNode.isBlank());
    }

    @Test
    public void outerHtml_ShouldGenerateCorrectOutput() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream printOut = setStdOutPrintStream(output);
        textNode.outerHtmlHead(new StringBuilder(), 0, new Document.OutputSettings(true));
        // Reset to the default
        resetStdOutPrintStream();
        String expectedOutput = "This is a sample text";
        assertEquals(expectedOutput, output.toString());
    }

    @Test
    public void toString_ShouldGenerateCorrectOutput() {
        String expectedText = "This is a sample text";
        assertEquals(expectedText, textNode.toString());
    }

}