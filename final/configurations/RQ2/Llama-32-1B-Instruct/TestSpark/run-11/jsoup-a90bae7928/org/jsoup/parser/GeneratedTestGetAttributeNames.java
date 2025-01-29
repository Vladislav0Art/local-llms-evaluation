package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGetAttributeNames {

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
    public void testGetAttributeNames() {
        String expectedAttributeNames = "[\"id\", \"class\"]";
        String[] expectedAttributes = new String[expectedAttributeNames.length()];
        int i = 0;
        for (String attr : expectedAttributeNames.split(", ")) {
            if (attr.startsWith("on")) {
                expectedAttributes[i++] = "on" + attr.substring(2);
            } else {
                expectedAttributes[i++] = attr;
            }
        }

        String[] actualAttributes = tagParser.getAttributeNames();
        int j = 0;
        for (String attr : actualAttributes) {
            if (j < expectedAttributeNames.length()) {
                assertEquals(expectedAttributeNames.charAt(j++), attr);
            } else {
                throw new AssertionError();
            }
        }
    }

}