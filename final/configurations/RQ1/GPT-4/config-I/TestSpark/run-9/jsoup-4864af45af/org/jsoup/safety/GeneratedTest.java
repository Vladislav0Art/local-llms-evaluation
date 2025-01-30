package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("div", "p");
        Assert.assertTrue(safelist.isSafeTag("div"));
        Assert.assertTrue(safelist.isSafeTag("p"));
        Assert.assertFalse(safelist.isSafeTag("span"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("div", "p");
        safelist.removeTags("div");
        Assert.assertFalse(safelist.isSafeTag("div"));
        Assert.assertTrue(safelist.isSafeTag("p"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href");
        safelist.addTags("a");
        Element element = new Element("a");
        element.attr("href", "http://fakeurl.com");
        Assert.assertTrue(safelist.isSafeAttribute("a", element, new Attribute("href", "http://fakeurl.com")));
        Assert.assertFalse(safelist.isSafeAttribute("a", element, new Attribute("style", "color: Red")));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href", "style");
        safelist.addTags("a");
        Element element = new Element("a");
        element.attr("href", "http://fakeurl.com");
        element.attr("style", "color: Red");
        safelist.removeAttributes("a", "style");
        Assert.assertTrue(safelist.isSafeAttribute("a", element, new Attribute("href", "http://fakeurl.com")));
        Assert.assertFalse(safelist.isSafeAttribute("a", element, new Attribute("style", "color: Red")));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("a", "rel", "nofollow");
        Assert.assertEquals(Arrays.asList(new Attribute("rel", "nofollow")), safelist.getEnforcedAttributes("a"));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("a", "rel", "nofollow");
        safelist.removeEnforcedAttribute("a", "rel");
        Assert.assertEquals(0, safelist.getEnforcedAttributes("a").size());
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "http", "https");
        safelist.addTags("a");
        Element element = new Element("a");
        element.attr("href", "http://fakeurl.com");
        Assert.assertTrue(safelist.isSafeAttribute("a", element, new Attribute("href", "http://fakeurl.com")));
        Assert.assertFalse(safelist.isSafeAttribute("a", element, new Attribute("href", "javascript:alert()")));
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "http", "https");
        safelist.addTags("a");
        Element element = new Element("a");
        element.attr("href", "http://fakeurl.com");
        safelist.removeProtocols("a", "href", "http");
        Assert.assertFalse(safelist.isSafeAttribute("a", element, new Attribute("href", "http://fakeurl.com")));
    }

}