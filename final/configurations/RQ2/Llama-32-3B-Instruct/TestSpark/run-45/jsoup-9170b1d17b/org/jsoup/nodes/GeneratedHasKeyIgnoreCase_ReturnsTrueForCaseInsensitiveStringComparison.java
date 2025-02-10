package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.ParserBase;

public class GeneratedHasKeyIgnoreCase_ReturnsTrueForCaseInsensitiveStringComparison {

    @Test
    public void hasKeyIgnoreCase_ReturnsTrueForCaseInsensitiveStringComparison() {
        Attributes attributes = new Attributes();
        attributes.put("test", "Value");
        assertTrue(attributes.hasKeyIgnoreCase("test"));
    }

}