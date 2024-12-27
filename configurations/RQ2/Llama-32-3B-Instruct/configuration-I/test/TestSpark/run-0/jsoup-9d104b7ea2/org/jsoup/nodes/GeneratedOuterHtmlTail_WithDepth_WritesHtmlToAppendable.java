package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedOuterHtmlTail_WithDepth_WritesHtmlToAppendable {

    @Test
    public void outerHtmlTail_WithDepth_WritesHtmlToAppendable() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document document = new Document();
        document.outerHtmlTail(outContent, 1, null);
        String expectedOutput = "</html>";
        assertEquals(expectedOutput, outContent.toString());
    }

}