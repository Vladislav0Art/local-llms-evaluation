package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.junit.Assert;

import java.util.Set;

public class GeneratedTest {

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        Assert.assertEquals(0, safelist.getEnforcedAttributes("body").size());
    }

    @Test
    public void simpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        Assert.assertFalse(safelist.isSafeTag("img"));
    }

    @Test
    public void basicTest() {
        Safelist safelist = Safelist.basic();
        Assert.assertTrue(safelist.isSafeTag("a"));
    }

    @Test
    public void basicWithImagesTest() {
        Safelist safelist = Safelist.basicWithImages();
        Assert.assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void relaxedTest() {
        Safelist safelist = Safelist.relaxed();
        Assert.assertTrue(safelist.isSafeTag("span"));
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        Assert.assertTrue(safelist.isSafeTag("tag1"));
        Assert.assertTrue(safelist.isSafeTag("tag2"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeTags("span");
        Assert.assertFalse(safelist.isSafeTag("span"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("tag1", "attr1", "attr2");
        Element el = new Element("tag1");
        el.attr("attr1", "value1");
        Attribute attr = el.attributes().iterator().next();
        Assert.assertTrue(safelist.isSafeAttribute("tag1", el, attr));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeAttributes("a", "href");
        Element el = new Element("a");
        el.attr("href", "https://example.com");
        Attribute attr = el.attributes().iterator().next();
        Assert.assertFalse(safelist.isSafeAttribute("a", el, attr));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("tag1", "attr1", "value1");
        Attributes attrs = safelist.getEnforcedAttributes("tag1");
        Assert.assertTrue(attrs.hasKey("attr1"));
        Assert.assertEquals("value1", attrs.get("attr1"));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("tag1", "attr1", "value1");
        safelist.removeEnforcedAttribute("tag1", "attr1");
        Attributes attrs = safelist.getEnforcedAttributes("tag1");
        Assert.assertFalse(attrs.hasKey("attr1"));
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        safelist.preserveRelativeLinks(true);
        Element el = new Element("a");
        el.attr("href", "/example");
        Attribute attr = el.attributes().iterator().next();
        Assert.assertTrue(safelist.isSafeAttribute("a", el, attr));
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "http", "https");
        Element el = new Element("a");
        el.attr("href", "http://example.com");
        Attribute attr = el.attributes().iterator().next();
        Assert.assertTrue(safelist.isSafeAttribute("a", el, attr));
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.basic();
        safelist.removeProtocols("a", "href", "http");
        Element el = new Element("a");
        el.attr("href", "http://example.com");
        Attribute attr = el.attributes().iterator().next();
        Assert.assertFalse(safelist.isSafeAttribute("a", el, attr));
    }

}