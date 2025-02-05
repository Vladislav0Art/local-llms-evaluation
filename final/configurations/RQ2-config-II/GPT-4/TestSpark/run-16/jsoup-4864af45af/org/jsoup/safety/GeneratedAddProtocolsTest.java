package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.mockito.Mockito;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        String tag = "tag";
        safelist.addTags(tag);
        safelist.addProtocols(tag, "attr", "http");
        Attribute attr = new Attribute("attr", "http://example.com");
        Assert.assertTrue(safelist.isSafeAttribute(tag, new Element(tag), attr));
    }

}