package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.ParserBase;

public class GeneratedRemove_RemovesKeyFromAttributes {

    @Test
    public void remove_RemovesKeyFromAttributes() {
        Attributes attributes = new Attributes();
        attributes.put("test", "value");
        attributes.remove("test");
        assertNull(attributes.get("test"));
    }

}