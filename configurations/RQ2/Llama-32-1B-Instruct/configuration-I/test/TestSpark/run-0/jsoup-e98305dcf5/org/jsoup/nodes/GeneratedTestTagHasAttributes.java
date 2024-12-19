package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.jsoup.nodes.*;

public class GeneratedTestTagHasAttributes {

    @Test
    public void testTagHasAttributes() {
        Document doc = Jsoup.create("<span id='my-span'>Hello World!</span>");
        assertElementHasAttributes(doc);
    }

}