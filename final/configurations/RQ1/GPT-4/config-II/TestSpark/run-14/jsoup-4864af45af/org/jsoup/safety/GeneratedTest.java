package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("a");
        Assert.assertTrue(safelist.isSafeTag("a"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("a");
        safelist.removeTags("a");
        Assert.assertFalse(safelist.isSafeTag("a"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addAttributes("a", "href");

        Element el = new Element("a");
        el.attr("href", "https://google.com");

        Assert.assertTrue(safelist.isSafeAttribute("a", el, el.attr("href")));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addAttributes("a", "href");
        safelist.removeAttributes("a", "href");

        Element el = new Element("a");
        el.attr("href", "https://google.com");

        Assert.assertFalse(safelist.isSafeAttribute("a", el, el.attr("href")));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addEnforcedAttribute("a", "href", "https://google.com");

        Element el = new Element("a");
        el.attr("href", "https://google.com");

        Assert.assertTrue(safelist.isSafeAttribute("a", el, el.attr("href")));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addEnforcedAttribute("a", "href", "https://google.com");
        safelist.removeEnforcedAttribute("a", "href");

        Element el = new Element("a");
        el.attr("href", "https://google.com");

        Assert.assertFalse(safelist.isSafeAttribute("a", el, el.attr("href")));
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addProtocols("a", "href", "https");

        Element el = new Element("a");
        el.attr("href", "https://google.com");

        Assert.assertTrue(safelist.isSafeAttribute("a", el, el.attr("href")));
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addProtocols("a", "href", "https");
        safelist.removeProtocols("a", "href", "https");

        Element el = new Element("a");
        el.attr("href", "https://google.com");

        Assert.assertFalse(safelist.isSafeAttribute("a", el, el.attr("href")));
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.none();

        safelist.addProtocols("a", "href", "#");
        safelist.preserveRelativeLinks(true);

        Element el = new Element("a");
        el.attr("href", "#section1");

        Assert.assertTrue(safelist.isSafeAttribute("a", el, el.attr("href")));
    }

    @Test
    public void basicSafelistTest() {
        Safelist safelist = Safelist.basic();

        Element el = new Element("a");
        el.attr("href", "https://google.com");

        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertTrue(safelist.isSafeAttribute("a", el, el.attr("href")));
    }

    @Test
    public void noneSafelistTest() {
        Safelist safelist = Safelist.none();

        Assert.assertFalse(safelist.isSafeTag("a"));

        Element el = new Element("a");
        el.attr("href", "https://google.com");

        Assert.assertFalse(safelist.isSafeAttribute("a", el, el.attr("href")));
    }

    @Test
    public void simpleTextSafelistTest() {
        Safelist safelist = Safelist.simpleText();
        Assert.assertTrue(safelist.isSafeTag("b"));

        Element el = new Element("b");

        Assert.assertTrue(safelist.isSafeAttribute("b", new Element("b"), new Attribute("b", "href", "https://google.com")));
    }

    @Test
    public void basicWithImagesSafelistTest() {
        Safelist safelist = Safelist.basicWithImages();
        Assert.assertTrue(safelist.isSafeTag("img"));

        Element el = new Element("img");
        el.attr("src", "https://google.com/img.jpg");

        Assert.assertTrue(safelist.isSafeAttribute("img", el, el.attr("src")));
    }

    @Test
    public void relaxedSafelistTest() {
        Safelist safelist = Safelist.relaxed();
        Assert.assertTrue(safelist.isSafeTag("div"));

        Element el = new Element("div");
        el.attr("class", "my-class");

        Assert.assertFalse(safelist.isSafeAttribute("div", el, el.attr("class")));
    }

}