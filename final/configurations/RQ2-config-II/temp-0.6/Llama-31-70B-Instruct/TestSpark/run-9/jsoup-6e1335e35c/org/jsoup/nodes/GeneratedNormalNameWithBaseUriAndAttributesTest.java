package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

public class GeneratedNormalNameWithBaseUriAndAttributesTest {

    @Test
    public void normalNameWithBaseUriAndAttributesTest() {
        Element element = new Element("tag", "baseUri", null);
        String actualNormalName = element.normalName();
        assertEquals("tag", actualNormalName);
    }

}