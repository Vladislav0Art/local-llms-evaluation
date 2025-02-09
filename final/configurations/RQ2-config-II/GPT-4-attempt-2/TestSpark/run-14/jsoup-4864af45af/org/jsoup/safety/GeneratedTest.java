package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void noneTest() {
        Safelist result = Safelist.none();
        assertNotNull(result);
    }

    @Test
    public void simpleTextTest() {
        Safelist result = Safelist.simpleText();
        assertNotNull(result);
    }

    @Test
    public void basicTest() {
        Safelist result = Safelist.basic();
        assertNotNull(result);
    }

    @Test
    public void basicWithImagesTest() {
        Safelist result = Safelist.basicWithImages();
        assertNotNull(result);
    }

    @Test
    public void relaxedTest() {
        Safelist result = Safelist.relaxed();
        assertNotNull(result);
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.addTags("p", "div");
        assertNotNull(result);
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.removeTags("p", "div");
        assertNotNull(result);
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.addAttributes("img", "src", "alt");
        assertNotNull(result);
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.removeAttributes("img", "src", "alt");
        assertNotNull(result);
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.addEnforcedAttribute("a", "target", "_blank");
        assertNotNull(result);
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.removeEnforcedAttribute("a", "rel");
        assertNotNull(result);
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.preserveRelativeLinks(true);
        assertNotNull(result);
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.addProtocols("a", "href", "http", "https");
        assertNotNull(result);
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.removeProtocols("a", "href", "ftp");
        assertNotNull(result);
    }

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = new Safelist();
        Element el = mock(Element.class);
        Attribute attr = mock(Attribute.class);

        boolean result = safelist.isSafeAttribute("a", el, attr);
        assertFalse(result);
    }

}