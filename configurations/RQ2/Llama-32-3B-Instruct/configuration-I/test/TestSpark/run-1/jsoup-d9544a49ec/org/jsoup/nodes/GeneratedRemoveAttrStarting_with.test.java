package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttrStarting_with.

test {

    @Test
    public void removeAttrStarting_with.test() {
        Element element = new Element("test");
        element.addAttr("attr1", "value1");
        element.removeAttr("attr1"); // attr2 should not be removed
        assertEquals(0, element.getAttributeCount());
    }

}