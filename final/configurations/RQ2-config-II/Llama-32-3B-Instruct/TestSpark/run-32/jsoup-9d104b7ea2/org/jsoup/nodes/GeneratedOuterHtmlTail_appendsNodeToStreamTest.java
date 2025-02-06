package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class GeneratedOuterHtmlTail_appendsNodeToStreamTest {

    @Test
    public void outerHtmlTail_appendsNodeToStreamTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        TextNode node = new TextNode("test");
        Document document = new Document.Builder().append(node).build();
        document.outerHtmlTail(System.out, 0, new Document.OutputSettings());
        assertEquals("test", outContent.toString());
        originalOut.flush();
        originalOut.close();
    }

}