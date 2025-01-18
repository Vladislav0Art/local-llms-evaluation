package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        Assert.assertNotNull(safelist);
    }

    @Test
    public void simpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        Assert.assertNotNull(safelist);
    }

    @Test
    public void basicTest() {
        Safelist safelist = Safelist.basic();
        Assert.assertNotNull(safelist);
    }

    @Test
    public void basicWithImagesTest() {
        Safelist safelist = Safelist.basicWithImages();
        Assert.assertNotNull(safelist);
    }

    @Test
    public void relaxedTest() {
        Safelist safelist = Safelist.relaxed();
        Assert.assertNotNull(safelist);
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
        safelist.removeTags("tag2");

        Assert.assertTrue(safelist.isSafeTag("tag1"));
        Assert.assertFalse(safelist.isSafeTag("tag2"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        safelist.addAttributes("tag1", "attr1", "attr2");

        Element element = new Element("tag1");
        element.attr("attr1", "");
        element.attr("attr2", "");

        Assert.assertTrue(safelist.isSafeAttribute("tag1", element, new Attribute("attr1", "")));
        Assert.assertTrue(safelist.isSafeAttribute("tag1", element, new Attribute("attr2", "")));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        safelist.addAttributes("tag1", "attr1", "attr2");
        safelist.removeAttributes("tag1", "attr2");

        Element element = new Element("tag1");
        element.attr("attr1", "");
        element.attr("attr2", "");

        Assert.assertTrue(safelist.isSafeAttribute("tag1", element, new Attribute("attr1", "")));
        Assert.assertFalse(safelist.isSafeAttribute("tag1", element, new Attribute("attr2", "")));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1");
        safelist.addEnforcedAttribute("tag1", "attr1", "value1");

        Assert.assertTrue(safelist.getEnforcedAttributes("tag1").hasKey("attr1"));
        Assert.assertEquals("value1", safelist.getEnforcedAttributes("tag1").get("attr1"));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1");
        safelist.addEnforcedAttribute("tag1", "attr1", "value1");
        safelist.removeEnforcedAttribute("tag1", "attr1");

        Assert.assertFalse(safelist.getEnforcedAttributes("tag1").hasKey("attr1"));
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        safelist.preserveRelativeLinks(true);

        Element element = new Element("tag1");
        element.attr("href", "/relative/path");

        Assert.assertTrue(safelist.isSafeAttribute("tag1", element, new Attribute("href", "/relative/path")));
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1");
        safelist.addProtocols("tag1", "attr1", "http", "https");

        Element element = new Element("tag1");
        element.attr("attr1", "http://www.example.com");

        Assert.assertTrue(safelist.isSafeAttribute("tag1", element, new Attribute("attr1", "http://www.example.com")));
    }

}