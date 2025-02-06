package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedAddAttributes_addsAttributesTest {

    @Test
    public void addAttributes_addsAttributesTest() {
        Safelist safelist = Safelist.addTags("a", "href");
        assertEquals(1, safelist.getEnforcedAttributes("a").size());
        safelist = safelist.removeAttributes("a", "href");
        assertFalse(safelist.getEnforcedAttributes("a").containsKey("href"));
    }

}