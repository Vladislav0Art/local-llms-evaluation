package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedOuterHtmlHead_WritesHtmlToAppendable {

    @Test
    public void outerHtmlHead_WritesHtmlToAppendable() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document document = new Document();
        document.outerHtmlHead(outContent, 0, null);
        String expectedOutput = "<html><head></head>";
        assertEquals(expectedOutput, outContent.toString());
    }

}