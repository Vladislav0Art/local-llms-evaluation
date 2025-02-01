package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void RemoveEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("a").addEnforcedAttribute("a", "rel", "nofollow");
        Attributes attrs = safelist.getEnforcedAttributes("a");
        assertTrue(attrs.hasKey("rel"));
        Assert.assertEquals("nofollow", attrs.get("rel"));
        safelist.removeEnforcedAttribute("a", "rel");
        attrs = safelist.getEnforcedAttributes("a");
        assertFalse(attrs.hasKey("rel"));
    }

}