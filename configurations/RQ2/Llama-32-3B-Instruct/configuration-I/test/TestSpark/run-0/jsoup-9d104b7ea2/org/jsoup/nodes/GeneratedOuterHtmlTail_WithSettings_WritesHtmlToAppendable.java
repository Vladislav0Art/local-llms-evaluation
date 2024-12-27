package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedOuterHtmlTail_WithSettings_WritesHtmlToAppendable {

    @Test
    public void outerHtmlTail_WithSettings_WritesHtmlToAppendable() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document.OutputSettings settings = Document.OutputSettings.createDefaultSettings(false, false);
        Document document = new Document();
        document.outerHtmlTail(outContent, 0, settings);
        String expectedOutput = "</html>";
        assertEquals(expectedOutput, outContent.toString());
    }

}