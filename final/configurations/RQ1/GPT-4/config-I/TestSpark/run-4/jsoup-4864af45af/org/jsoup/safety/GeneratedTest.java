package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Cleaner;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void noneTest() {
        final Safelist safelist = Safelist.none();
        assertNotNull(safelist);
    }

    @Test
    public void simpleTextTest() {
        final Safelist safelist = Safelist.simpleText();
        assertNotNull(safelist);
    }

    @Test
    public void basicTest() {
        final Safelist safelist = Safelist.basic();
        assertNotNull(safelist);
    }

    @Test
    public void basicWithImagesTest() {
        final Safelist safelist = Safelist.basicWithImages();
        assertNotNull(safelist);
    }

    @Test
    public void relaxedTest() {
        final Safelist safelist = Safelist.relaxed();
        assertNotNull(safelist);
    }

    @Test
    public void addTagsTest() {
        final Safelist safelist = Safelist.none().addTags("b", "em");
        assertNotNull(safelist);
    }

    @Test
    public void removeTagsTest() {
        final Safelist safelist = Safelist.none().removeTags("a", "p");
        assertNotNull(safelist);
    }

    @Test
    public void addAttributesTest() {
        final Safelist safelist = Safelist.none().addAttributes("img", "src", "alt");
        assertNotNull(safelist);
    }

    @Test
    public void removeAttributesTest() {
        final Safelist safelist = Safelist.none().removeAttributes("img", "src", "alt");
        assertNotNull(safelist);
    }

    @Test
    public void addEnforcedAttributeTest() {
        final Safelist safelist = Safelist.none().addEnforcedAttribute("a", "rel", "nofollow");
        assertNotNull(safelist);
    }

    @Test
    public void removeEnforcedAttributeTest() {
        final Safelist safelist = Safelist.none().removeEnforcedAttribute("a", "rel");
        assertNotNull(safelist);
    }

    @Test
    public void preserveRelativeLinksTest() {
        final Safelist safelist = Safelist.none().preserveRelativeLinks(true);
        assertNotNull(safelist);
    }

    @Test
    public void addProtocolsTest() {
        final Safelist safelist = Safelist.none().addProtocols("a", "href", "http", "https", "ftp");
        assertNotNull(safelist);
    }

    @Test
    public void removeProtocolsTest() {
        final Safelist safelist = Safelist.none().removeProtocols("a", "href", "http", "https", "ftp");
        assertNotNull(safelist);
    }

    @Test
    public void isSafeTagTest() {
        final Safelist safelist = Safelist.none().addTags("b", "em");
        assertTrue(safelist.isSafeTag("b"));
        assertFalse(safelist.isSafeTag("img"));
    }

    @Test
    public void isSafeAttributeTest() {
        final Safelist safelist = Safelist.none().addAttributes("body", "class");
        final Element element = new Element("body").attr("class", "test");
        final Attribute attr = new Attribute("class", "test");
        assertTrue(safelist.isSafeAttribute("body", element, attr));
    }

}