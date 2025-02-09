package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
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
        Safelist result = safelist.addTags("tag1", "tag2");
        assertNotNull(result);
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.removeTags("tag1", "tag2");
        assertNotNull(result);
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.addAttributes("tag", "attribute1", "attribute2");
        assertNotNull(result);
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.removeAttributes("tag", "attribute1", "attribute2");
        assertNotNull(result);
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.addEnforcedAttribute("tag", "attribute", "value");
        assertNotNull(result);
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.removeEnforcedAttribute("tag", "attribute");
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
        Safelist result = safelist.addProtocols("tag", "attribute", "protocol1", "protocol2");
        assertNotNull(result);
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.removeProtocols("tag", "attribute", "protocol1", "protocol2");
        assertNotNull(result);
    }

    @Test
    public void isSafeTagTest() {
        Safelist safelist = new Safelist();
        boolean result = safelist.isSafeTag("tag");
        assertFalse(result);
    }

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = new Safelist();
        Attribute attr = new Attribute("attrKey", "attrValue");
        Element el = new Element("tagName");
        boolean result = safelist.isSafeAttribute("tagName", el, attr);
        assertFalse(result);
    }

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("tag", "attribute", "value");
        Attributes result = safelist.getEnforcedAttributes("tag");
        assertNotNull(result);
    }

}