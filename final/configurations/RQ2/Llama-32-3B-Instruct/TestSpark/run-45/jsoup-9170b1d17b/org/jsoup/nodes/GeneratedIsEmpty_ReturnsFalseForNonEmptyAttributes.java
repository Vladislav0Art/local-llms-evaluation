package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.ParserBase;

public class GeneratedIsEmpty_ReturnsFalseForNonEmptyAttributes {

    @Test
    public void isEmpty_ReturnsFalseForNonEmptyAttributes() {
        Attributes attributes = new Attributes();
        attributes.put("test", "value");
        assertFalse(attributes.isEmpty());
    }

}