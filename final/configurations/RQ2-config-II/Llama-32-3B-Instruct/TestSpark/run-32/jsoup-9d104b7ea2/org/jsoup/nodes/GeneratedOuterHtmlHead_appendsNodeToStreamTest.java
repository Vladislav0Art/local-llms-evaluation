package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class GeneratedOuterHtmlHead_appendsNodeToStreamTest {

    @Test
    public void outerHtmlHead_appendsNodeToStreamTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        TextNode node = new TextNode("test");
        Document document = new Document.Builder().append(node).build();
        document.outerHtmlHead(System.out, 0, new Document.OutputSettings());
        assertEquals("test", outContent.toString());
        originalOut.flush();
        originalOut.close();
    }

}