package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedAddAttributesTest {

    @Test
    public void AddAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("a").addAttributes("a", "href");
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "http://example.com")));
    }

}