package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;

public class GeneratedTest {

    @Test
    public void noneTest() {
        Safelist result = Safelist.none();
        Assert.assertNotNull(result);
    }

    @Test
    public void simpleTextTest() {
        Safelist result = Safelist.simpleText();
        Assert.assertNotNull(result);
    }

    @Test
    public void basicTest() {
        Safelist result = Safelist.basic();
        Assert.assertNotNull(result);
    }

    @Test
    public void basicWithImagesTest() {
        Safelist result = Safelist.basicWithImages();
        Assert.assertNotNull(result);
    }

    @Test
    public void relaxedTest() {
        Safelist result = Safelist.relaxed();
        Assert.assertNotNull(result);
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.addTags("tag1", "tag2");
        Assert.assertNotNull(result);
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.removeTags("tag1", "tag2");
        Assert.assertNotNull(result);
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.addAttributes("tag", "attr1", "attr2");
        Assert.assertNotNull(result);
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.removeAttributes("tag", "attr1", "attr2");
        Assert.assertNotNull(result);
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.addEnforcedAttribute("tag", "attribute", "value");
        Assert.assertNotNull(result);
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.removeEnforcedAttribute("tag", "attribute");
        Assert.assertNotNull(result);
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.preserveRelativeLinks(true);
        Assert.assertNotNull(result);
        result = safelist.preserveRelativeLinks(false);
        Assert.assertNotNull(result);
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.addProtocols("tag", "attribute", "protocol1", "protocol2");
        Assert.assertNotNull(result);
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.removeProtocols("tag", "attribute", "protocol1", "protocol2");
        Assert.assertNotNull(result);
    }

    @Test
    public void isSafeTagTest() {
        Safelist safelist = new Safelist();
        boolean result = safelist.isSafeTag("tag");
        Assert.assertFalse(result);
        safelist.addTags("tag");
        result = safelist.isSafeTag("tag");
        Assert.assertTrue(result);
    }

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = new Safelist();
        Element element = new Element("tag");
        Attribute attribute = new Attribute("attribute", "value");
        boolean result = safelist.isSafeAttribute("tag", element, attribute);
        Assert.assertFalse(result);
        safelist.addAttributes("tag", "attribute");
        result = safelist.isSafeAttribute("tag", element, attribute);
        Assert.assertTrue(result);
    }

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = new Safelist();
        Attributes result = safelist.getEnforcedAttributes("Tag");
        Assert.assertNotNull(result);
    }

}