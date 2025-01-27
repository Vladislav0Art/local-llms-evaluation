package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedParserBasicTest {

    @Test
    public void parserBasicTest() {
        Document document = new Document("http://example.com");
        Parser parser = document.parser();
        org.junit.Assert.assertNull(parser);
    }

}