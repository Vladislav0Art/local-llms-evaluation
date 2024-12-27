package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedInitialiseParse_InitializesWithValidInputAndBaseUri {

    @Test
    public void initialiseParse_InitializesWithValidInputAndBaseUri() throws IOException, InterruptedException {
        String xml = "<html><body>Hello World!</body></html>";
        List<String> expectedTags = new ArrayList<>();
        expectedTags.add("html");
        expectedTags.add("body");
        expectedTags.add("/body");
        expectedTags.add("/html");

        Document document = new XmlTreeBuilder().initialiseParse(new StringReader(xml), "baseUri", null);
        assertTrue(document.tags.containsAll(expectedTags));
    }

}