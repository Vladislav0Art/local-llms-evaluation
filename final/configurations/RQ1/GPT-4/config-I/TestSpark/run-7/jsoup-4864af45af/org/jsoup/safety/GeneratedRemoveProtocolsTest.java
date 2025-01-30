package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addProtocols("a", "href", "http");
        safelist.removeProtocols("a", "href", "http");
        Assert.assertFalse(safelist.isSafeAttribute("a", new Element("<a href='http://www.sample.com'></a>"), new Attribute("href", "")));
    }

}