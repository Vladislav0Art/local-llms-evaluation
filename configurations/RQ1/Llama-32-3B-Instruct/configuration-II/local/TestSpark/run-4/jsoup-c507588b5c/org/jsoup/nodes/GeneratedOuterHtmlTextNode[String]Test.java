package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.swing.JEditorPane;

public class GeneratedOuterHtmlTextNode[String]

Test {

    @Test
    public void outerHtmlTextNode[ String]Test() throws IOException {
        String testText = "Hello World";
        TextNode textNode = new TextNode(testText);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document.OutputSettings settings = new Document.OutputSettings(true);
        Appendable accum = new StringBuilder();

        textNode.outerHtmlHead(accum, 0, settings);
        textNode.outerHtmlTail(accum, 0, settings);

        accum.append(outContent.toString());
        assertEquals("<p>Hello World</p>", accum.toString().trim());
    }

}