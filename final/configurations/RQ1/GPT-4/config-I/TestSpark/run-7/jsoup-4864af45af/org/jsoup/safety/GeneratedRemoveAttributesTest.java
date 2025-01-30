package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addAttributes("a", "href");
        safelist.removeAttributes("a", "href");
        Assert.assertFalse(safelist.isSafeAttribute("a", new Element("<a href=''></a>"), new Attribute("href", "")));
    }

}