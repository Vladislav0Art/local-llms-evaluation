package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedInitialiseParse_InitializesWithEmptyInputAndBaseUri {

    @Test
    public void initialiseParse_InitializesWithEmptyInputAndBaseUri() throws IOException, InterruptedException {
        List<String> expectedTags = new ArrayList<>();
        Document document = new XmlTreeBuilder().initialiseParse(new StringReader(""), "baseUri", null);
        assertTrue(document.tags.isEmpty());
    }

}