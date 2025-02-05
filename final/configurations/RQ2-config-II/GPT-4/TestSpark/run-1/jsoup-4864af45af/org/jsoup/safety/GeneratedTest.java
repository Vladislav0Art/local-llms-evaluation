package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        assertNotNull(safelist);
    }

    @Test
    public void simpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        assertNotNull(safelist);
    }

    @Test
    public void basicTest() {
        Safelist safelist = Safelist.basic();
        assertNotNull(safelist);
    }

    @Test
    public void basicWithImagesTest() {
        Safelist safelist = Safelist.basicWithImages();
        assertNotNull(safelist);
    }

    @Test
    public void relaxedTest() {
        Safelist safelist = Safelist.relaxed();
        assertNotNull(safelist);
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2", "tag3");
        assertTrue(safelist.isSafeTag("tag1"));
        assertTrue(safelist.isSafeTag("tag2"));
        assertTrue(safelist.isSafeTag("tag3"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist().addTags("tag1", "tag2", "tag3");
        safelist.removeTags("tag1", "tag3");
        assertFalse(safelist.isSafeTag("tag1"));
        assertFalse(safelist.isSafeTag("tag3"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist().addTags("tag").addAttributes("tag", "attr1", "attr2");
        Element element = new Element("tag");
        element.attr("attr1", "val1");
        element.attr("attr2", "val2");
        Attribute attr1 = element.attributes().asList().get(0);
        Attribute attr2 = element.attributes().asList().get(1);
        assertTrue(safelist.isSafeAttribute("tag", element, attr1));
        assertTrue(safelist.isSafeAttribute("tag", element, attr2));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist().addTags("tag").addAttributes("tag", "attr1", "attr2");
        safelist.removeAttributes("tag", "attr1", "attr2");
        Element element = new Element("tag");
        element.attr("attr1", "value1");
        element.attr("attr2", "value2");
        Attribute attr1 = element.attributes().asList().get(0);
        Attribute attr2 = element.attributes().asList().get(1);
        assertFalse(safelist.isSafeAttribute("tag", element, attr1));
        assertFalse(safelist.isSafeAttribute("tag", element, attr2));
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist().addTags("tag1").addProtocols("tag1", "attr1", "protocol1");
        Element element = new Element("tag1");
        element.attr("attr1", "protocol1:value1");
        Attribute attr1 = element.attributes().asList().get(0);
        assertTrue(safelist.isSafeAttribute("tag1", element, attr1));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist().addTags("tag").addEnforcedAttribute("tag", "attr", "value");
        Attributes attrs = safelist.getEnforcedAttributes("tag");
        assertEquals("value", attrs.get("attr"));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist().addTags("tag").addEnforcedAttribute("tag", "attr", "value");
        safelist.removeEnforcedAttribute("tag", "attr");
        Attributes attrs = safelist.getEnforcedAttributes("tag");
        assertFalse(attrs.hasKey("attr"));
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist().preserveRelativeLinks(true);
        assertTrue(safelist.preserveRelativeLinks(true).isPreserveRelativeLinks());
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist().addTags("a").addProtocols("a", "href", "http", "ftp");
        safelist.removeProtocols("a", "href", "ftp");
        Element element = new Element("a").attr("href", "ftp://example.com");
        assertFalse(safelist.isSafeAttribute("a", element, element.attributes().asList().get(0)));
    }

}