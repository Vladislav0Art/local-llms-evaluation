package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.mockito.Mockito;

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
    public void copyConstructorTest() {
        Safelist safelist = new Safelist();
        Safelist result = new Safelist(safelist);
        Assert.assertNotNull(result);
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        Assert.assertTrue(safelist.isSafeTag("tag1"));
        Assert.assertTrue(safelist.isSafeTag("tag2"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        safelist.removeTags("tag1");
        Assert.assertFalse(safelist.isSafeTag("tag1"));
        Assert.assertTrue(safelist.isSafeTag("tag2"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        String tag = "tag";
        safelist.addTags(tag);
        safelist.addAttributes(tag, "attr");
        Attribute attr = new Attribute("attr", "value");
        Assert.assertTrue(safelist.isSafeAttribute(tag, new Element(tag), attr));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        String tag = "tag";
        safelist.addTags(tag);
        safelist.addAttributes(tag, "attr");
        Attribute attr = new Attribute("attr", "value");
        safelist.removeAttributes(tag, "attr");
        Assert.assertFalse(safelist.isSafeAttribute(tag, new Element(tag), attr));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        String tag = "tag";
        safelist.addTags(tag);
        safelist.addEnforcedAttribute(tag, "attr", "value");
        Assert.assertTrue(safelist.getEnforcedAttributes(tag).hasKey("attr"));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        String tag = "tag";
        safelist.addTags(tag);
        safelist.addEnforcedAttribute(tag, "attr", "value");
        safelist.removeEnforcedAttribute(tag, "attr");
        Assert.assertFalse(safelist.getEnforcedAttributes(tag).hasKey("attr"));
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        safelist.preserveRelativeLinks(true);
        Assert.assertFalse(safelist.preserveRelativeLinks(false));
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        String tag = "tag";
        safelist.addTags(tag);
        safelist.addProtocols(tag, "attr", "http");
        Attribute attr = new Attribute("attr", "http://example.com");
        Assert.assertTrue(safelist.isSafeAttribute(tag, new Element(tag), attr));
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        String tag = "tag";
        safelist.addTags(tag);
        safelist.addProtocols(tag, "attr", "http");
        Attribute attr = new Attribute("attr", "http://example.com");
        safelist.removeProtocols(tag, "attr", "http");
        Assert.assertFalse(safelist.isSafeAttribute(tag, new Element(tag), attr));
    }

}