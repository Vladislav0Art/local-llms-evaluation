package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void noneTest() {
        Assert.assertNotNull(Safelist.none());
    }

    @Test
    public void simpleTextTest() {
        Assert.assertNotNull(Safelist.simpleText());
    }

    @Test
    public void basicTest() {
        Assert.assertNotNull(Safelist.basic());
    }

    @Test
    public void basicWithImagesTest() {
        Assert.assertNotNull(Safelist.basicWithImages());
    }

    @Test
    public void relaxedTest() {
        Assert.assertNotNull(Safelist.relaxed());
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("p", "br");
        Assert.assertTrue(safelist.isSafeTag("br"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeTags("a", "div");
        Assert.assertFalse(safelist.isSafeTag("a"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addAttributes("img", "src", "alt");
        Element el = new Element("img");
        el.attr("src", "http://example.com");
        el.attr("alt", "example");
        Attribute attrSrc = el.attribute("src");
        Attribute attrAlt = el.attribute("alt");
        Assert.assertTrue(safelist.isSafeAttribute("img", el, attrSrc));
        Assert.assertTrue(safelist.isSafeAttribute("img", el, attrAlt));
    }

}