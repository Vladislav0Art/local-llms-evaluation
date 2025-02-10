package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.ParserBase;

public class GeneratedHasKey_ReturnsTrueIfKeyExists {

    @Test
    public void hasKey_ReturnsTrueIfKeyExists() {
        Attributes attributes = new Attributes();
        attributes.put("test", "value");
        assertTrue(attributes.hasKey("test"));
    }

}