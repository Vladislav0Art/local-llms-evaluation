package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        String tag = "div";
        String attributes = "class";
        Safelist result = new Safelist().removeAttributes(tag, attributes);
        assertNotNull(result);
    }

}