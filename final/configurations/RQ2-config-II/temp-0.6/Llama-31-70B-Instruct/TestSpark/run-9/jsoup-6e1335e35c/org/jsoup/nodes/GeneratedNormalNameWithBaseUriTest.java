package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

public class GeneratedNormalNameWithBaseUriTest {

    @Test
    public void normalNameWithBaseUriTest() {
        Element element = new Element("tag", "baseUri");
        String actualNormalName = element.normalName();
        assertEquals("tag", actualNormalName);
    }

}