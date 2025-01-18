package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic().removeEnforcedAttribute("a", "target");
        Attributes attrs = safelist.getEnforcedAttributes("a");
        Assert.assertFalse(attrs.hasKey("target"));
    }

}