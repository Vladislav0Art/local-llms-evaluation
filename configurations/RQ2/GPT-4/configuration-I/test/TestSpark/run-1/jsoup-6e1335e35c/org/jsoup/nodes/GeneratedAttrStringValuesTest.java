package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedAttrStringValuesTest {

    @Test
    public void attrStringValuesTest() {
        Element element = new Element("tag");
        element.attr("key", "value");
        assertEquals("value", element.attributes().get("key"));
    }

}