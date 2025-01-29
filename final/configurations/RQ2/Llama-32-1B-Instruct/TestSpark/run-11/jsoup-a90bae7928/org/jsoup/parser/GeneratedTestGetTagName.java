package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGetTagName {

    private String htmlString = "<html><body><p>This is a test</p></body></html>";

    @Before
    public void init() {
        // Mock DOM document
        Document doc = new Document();
        Element body = doc.createElement("body");
        body.appendChild(doc.createTextNode(htmlString));
        doc.body.appendChild(body);

        // Set up mock parser
        Parser parser = new MyParser();
        TagParser tagParser = new TagParser(parser);
    }

    @Test
    public void testGetTagName() {
        String expectedTagName = "p";
        String actualTagName = tagParser.getTagName();
        assertEquals(expectedTagName, actualTagName);
    }

}