package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveEnforcedAttributeTest {

    // Testing public static methods

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("tag1", "attr1", "val1");
        safelist.removeEnforcedAttribute("tag1", "attr1");
        assertNull(safelist.getEnforcedAttributes("tag1").get("attr1"));
    }

}