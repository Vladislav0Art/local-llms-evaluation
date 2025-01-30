package org.jsoup.safety;

import org.jdom2.IllegalDataException;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addEnforcedAttribute("a", "href", "http://google.com");
        Assert.assertFalse(safelist.getEnforcedAttributes("a").isEmpty());
        safelist.removeEnforcedAttribute("a", "href");
        Assert.assertTrue(safelist.getEnforcedAttributes("a").isEmpty());
    }

}