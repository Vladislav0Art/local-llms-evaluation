package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

public class GeneratedNormalNameTest {

    @Test
    public void normalNameTest() {
        Element element = new Element("tag");
        String actualNormalName = element.normalName();
        assertEquals("tag", actualNormalName);
    }

}