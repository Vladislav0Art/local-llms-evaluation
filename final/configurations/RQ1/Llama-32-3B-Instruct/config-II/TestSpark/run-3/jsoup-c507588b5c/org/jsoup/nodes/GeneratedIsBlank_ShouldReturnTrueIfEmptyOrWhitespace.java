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

public class GeneratedIsBlank_ShouldReturnTrueIfEmptyOrWhitespace {

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
    public void isBlank_ShouldReturnTrueIfEmptyOrWhitespace() {
        assertTrue(textNode.isBlank());
        // Create a new text node with only whitespace
        TextNode blankTextNode = new TextNode(StringUtil.normaliseWhitespace(""));
        assertTrue(blankTextNode.isBlank());
    }

}