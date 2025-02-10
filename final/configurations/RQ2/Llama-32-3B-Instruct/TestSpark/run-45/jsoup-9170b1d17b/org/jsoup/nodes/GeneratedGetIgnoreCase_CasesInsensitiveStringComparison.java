package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.ParserBase;

public class GeneratedGetIgnoreCase_CasesInsensitiveStringComparison {

    @Test
    public void getIgnoreCase_CasesInsensitiveStringComparison() {
        Attributes attributes = new Attributes();
        attributes.put("test", "value");
        assertEquals("Value", attributes.getIgnoreCase("test"));
    }

}