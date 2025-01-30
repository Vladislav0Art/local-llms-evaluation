package org.jsoup.safety;

import org.jdom2.IllegalDataException;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedGetEnforcedAttributesTest {

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addEnforcedAttribute("a", "href", "http://google.com");
        Assert.assertEquals(1, safelist.getEnforcedAttributes("a").size());
        Assert.assertEquals("http://google.com", safelist.getEnforcedAttributes("a").get("href"));
    }

}