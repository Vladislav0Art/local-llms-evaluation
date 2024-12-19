package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.jsoup.nodes.*;

public class GeneratedTestTagHasBaseUri {

    @Test
    public void testTagHasBaseUri() {
        Document doc = Jsoup.create("<div>https://example.com/</div>");
        assertNodeHasAttribute(doc, "baseuri", "https://example.com/");
    }

}