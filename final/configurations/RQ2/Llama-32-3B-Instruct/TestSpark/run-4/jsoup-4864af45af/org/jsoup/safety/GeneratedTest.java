package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    @Test
    public void none() {
        Safelist none = Safelist.none();
        assertFalse(none.isSafeTag("div"));
    }

    @Test
    public void simpleText() {
        Safelist simpleText = Safelist.simpleText();
        assertTrue(simpleText.isSafeTag("span"));
    }

    @Test
    public void basic() {
        Safelist basic = Safelist.basic();
        assertTrue(basic.isSafeTag("p"));
        assertFalse(basic.isSafeTag("img"));
    }

    @Test
    public void basicWithImages() {
        Safelist basicWithImages = Safelist.basicWithImages();
        assertTrue(basicWithImages.isSafeTag("img"));
    }

    @Test
    public void relaxed() {
        Safelist relaxed = Safelist.relaxed();
        assertTrue(relaxed.isSafeTag("div"));
        assertFalse(relaxed.isSafeTag("script"));
    }

    @Test
    public void addTags() {
        Safelist basic = Safelist.basic();
        Safelist basicWithImg = Safelist.addTags(basic, "img");
        assertTrue(basicWithImg.isSafeTag("img"));
    }

    @Test
    public void removeTags() {
        Safelist basic = Safelist.basic();
        Safelist noImg = Safelist.removeTags(basic, "img");
        assertFalse(noImg.isSafeTag("img"));
    }

    @Test
    public void addAttributes() {
        Safelist basic = Safelist.basic();
        Safelist withClass = Safelist.addAttributes(basic, "class", "foo-bar");
        assertEquals("foo-bar", ((Attributes) withClass.getEnforcedAttributes("div")).getValue("class"));
    }

    @Test
    public void removeAttributes() {
        Safelist basic = Safelist.basic();
        Safelist noClass = Safelist.removeAttributes(basic, "class");
        assertNull(noClass.getEnforcedAttributes("div").getValue("class"));
    }

    @Test
    public void addEnforcedAttribute() {
        Safelist basicWithImg = Safelist.addTags(Safelist.basicWithImages(), "img");
        Safelist withStyle = Safelist.addEnforcedAttribute(basicWithImg, "style", "color: red;");
        assertEquals("color: red;", ((Attributes) withStyle.getEnforcedAttributes("img")).getValue("style"));
    }

    @Test
    public void removeEnforcedAttribute() {
        Safelist basicWithImg = Safelist.addTags(Safelist.basicWithImages(), "img");
        Safelist noStyle = Safelist.removeEnforcedAttribute(basicWithImg, "style");
        assertNull(noStyle.getEnforcedAttributes("img").getValue("style"));
    }

    @Test
    public void preserveRelativeLinks() {
        Safelist basic = Safelist.basic();
        Safelist withPreservedLinks = Safelist.preserveRelativeLinks(true);
        assertFalse(withPreservedLinks.isSafeAttribute("href", new Element(), new Attribute("a")));
    }

    @Test
    public void addProtocols() {
        Safelist basicWithImg = Safelist.addTags(Safelist.basicWithImages(), "img");
        Safelist withHttpOnly = Safelist.addProtocols(basicWithImg, "onload", "http-only;");
        assertEquals("http-only;", ((Attributes) withHttpOnly.getEnforcedAttributes("img")).getValue("onload"));
    }

    @Test
    public void removeProtocols() {
        Safelist basicWithImg = Safelist.addTags(Safelist.basicWithImages(), "img");
        Safelist noOnLoad = Safelist.removeProtocols(basicWithImg, "onload", new String[]{"http-only"});
        assertNull(noOnLoad.getEnforcedAttributes("img").getValue("onload"));
    }

    @Test
    public void isSafeTag() {
        Safelist basicWithImg = Safelist.addTags(Safelist.basicWithImages(), "img");
        assertTrue(basicWithImg.isSafeTag("img"));
    }

}