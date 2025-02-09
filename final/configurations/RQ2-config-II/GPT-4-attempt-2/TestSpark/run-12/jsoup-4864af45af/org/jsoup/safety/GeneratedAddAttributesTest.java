package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        String tag = "div";
        String attributes = "class";
        Safelist result = new Safelist().addAttributes(tag, attributes);
        assertNotNull(result);
    }

}