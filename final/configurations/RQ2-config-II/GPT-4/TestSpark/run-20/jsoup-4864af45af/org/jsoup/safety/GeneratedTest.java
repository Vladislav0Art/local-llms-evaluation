package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void noneInstanceNotNullTest() {
        assertNotNull(Safelist.none());
    }

    @Test
    public void simpleTextInstanceNotNullTest() {
        assertNotNull(Safelist.simpleText());
    }

    @Test
    public void basicInstanceNotNullTest() {
        assertNotNull(Safelist.basic());
    }

    @Test
    public void basicWithImagesInstanceNotNullTest() {
        assertNotNull(Safelist.basicWithImages());
    }

    @Test
    public void relaxedInstanceNotNullTest() {
        assertNotNull(Safelist.relaxed());
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        assertTrue(safelist.isSafeTag("tag1") && safelist.isSafeTag("tag2"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        safelist.removeTags("tag1");
        assertFalse(safelist.isSafeTag("tag1"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("tag", "attr1", "attr2");
        Element element = new Element("tag");
        element.attr("attr1", "value1");
        Attribute attribute = element.attributes().iterator().next();
        assertTrue(safelist.isSafeAttribute("tag", element, attribute));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("tag", "attr1", "attr2");
        safelist.removeAttributes("tag", "attr1");
        Element element = new Element("tag");
        element.attr("attr1", "value1");
        Attribute attribute = element.attributes().iterator().next();
        assertFalse(safelist.isSafeAttribute("tag", element, attribute));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("tag", "attr", "value");
        assertTrue(safelist.getEnforcedAttributes("tag").hasKey("attr"));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("tag", "attr", "value");
        safelist.removeEnforcedAttribute("tag", "attr");
        assertFalse(safelist.getEnforcedAttributes("tag").hasKey("attr"));
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("tag", "attr", "http", "https");
        Element element = new Element("tag");
        element.attr("attr", "http:value");
        Attribute attribute = element.attributes().iterator().next();
        assertTrue(safelist.isSafeAttribute("tag", element, attribute));
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("tag", "attr", "http", "https");
        safelist.removeProtocols("tag", "attr", "http");
        Element element = new Element("tag");
        element.attr("attr", "http:value");
        Attribute attribute = element.attributes().iterator().next();
        assertFalse(safelist.isSafeAttribute("tag", element, attribute));
    }

    @Test
    public void copyConstructorTest() {
        Safelist original = new Safelist().addTags("tag1", "tag2");
        Safelist copy = new Safelist(original);
        assertTrue(copy.isSafeTag("tag1"));
        assertTrue(copy.isSafeTag("tag2"));
    }

}