package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.jsoup.nodes.*;

public class GeneratedTestTagHasChildren {

    @Test
    public void testTagHasChildren() {
        Document doc = Jsoup.create("<div>Hello World!</div>");
        assertElementHasChildNodes(doc).size() == 1;
    }

}