package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        Assert.assertNotNull(safelist);
    }

    @Test
    public void simpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        Assert.assertNotNull(safelist);
    }

    @Test
    public void basicTest() {
        Safelist safelist = Safelist.basic();
        Assert.assertNotNull(safelist);
    }

    @Test
    public void basicWithImagesTest() {
        Safelist safelist = Safelist.basicWithImages();
        Assert.assertNotNull(safelist);
    }

    @Test
    public void relaxedTest() {
        Safelist safelist = Safelist.relaxed();
        Assert.assertNotNull(safelist);
    }

    @Test
    public void copyConstructorTest() {
        Safelist original = Safelist.none();
        Safelist copy = new Safelist(original);
        Assert.assertEquals(original, copy);
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("p");
        Assert.assertTrue(safelist.isSafeTag("p"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.basic();
        safelist.removeTags("p");
        Assert.assertFalse(safelist.isSafeTag("p"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addAttributes("p", "style");
        Assert.assertTrue(safelist.isSafeAttribute("p", new Element("div"), new Attribute("style", "")));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.basic();
        safelist.removeAttributes("div", "style");
        Assert.assertFalse(safelist.isSafeAttribute("div", new Element("div"), new Attribute("style", "")));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addEnforcedAttribute("div", "id", "test");
        Attributes attributes = safelist.getEnforcedAttributes("div");
        Assert.assertTrue(attributes.hasKey("id"));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic();
        safelist.removeEnforcedAttribute("div", "style");
        Attributes attributes = safelist.getEnforcedAttributes("div");
        Assert.assertFalse(attributes.hasKey("style"));
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.none();
        safelist.preserveRelativeLinks(true);
        Assert.assertTrue(safelist.isSafeAttribute("div", new Element("div"), new Attribute("href", "/path")));
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addProtocols("a", "href", "http");
        Assert.assertTrue(safelist.isSafeAttribute("a", new Element("div"), new Attribute("href", "http://example.com")));
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.basic();
        safelist.removeProtocols("a", "href", "http");
        Assert.assertFalse(safelist.isSafeAttribute("a", new Element("div"), new Attribute("href", "http://example.com")));
    }

    @Test
    public void isSafeTagTest() {
        Safelist safelist = Safelist.simpleText();
        Assert.assertTrue(safelist.isSafeTag("p"));
        Assert.assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = Safelist.basic();
        Assert.assertTrue(safelist.isSafeAttribute("a", new Element("div"), new Attribute("href", "")));
        Assert.assertFalse(safelist.isSafeAttribute("a", new Element("div"), new Attribute("onclick", "")));
    }

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = Safelist.basic();
        Attributes attributes = safelist.getEnforcedAttributes("a");
        Assert.assertTrue(attributes.hasKey("rel"));
    }

}