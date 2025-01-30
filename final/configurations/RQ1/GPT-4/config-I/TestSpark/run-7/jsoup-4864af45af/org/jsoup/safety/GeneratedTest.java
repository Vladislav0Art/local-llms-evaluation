package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
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
    public void addTagsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("a");
        Assert.assertTrue(safelist.isSafeTag("a"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addAttributes("a", "href");
        Assert.assertTrue(safelist.isSafeAttribute("a", new Element("<a href=''></a>"), new Attribute("href", "")));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addEnforcedAttribute("a", "href", "www.sample.com");
        Assert.assertNotNull(safelist.getEnforcedAttributes("a"));
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addProtocols("a", "href", "http");
        Assert.assertTrue(safelist.isSafeAttribute("a", new Element("<a href='http://www.sample.com'></a>"), new Attribute("href", "")));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("a");
        safelist.removeTags("a");
        Assert.assertFalse(safelist.isSafeTag("a"));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addAttributes("a", "href");
        safelist.removeAttributes("a", "href");
        Assert.assertFalse(safelist.isSafeAttribute("a", new Element("<a href=''></a>"), new Attribute("href", "")));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addEnforcedAttribute("a", "href", "www.sample.com");
        safelist.removeEnforcedAttribute("a", "href");
        Assert.assertFalse(safelist.getEnforcedAttributes("a").hasKey("href"));
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addProtocols("a", "href", "http");
        safelist.removeProtocols("a", "href", "http");
        Assert.assertFalse(safelist.isSafeAttribute("a", new Element("<a href='http://www.sample.com'></a>"), new Attribute("href", "")));
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.none();
        safelist.preserveRelativeLinks(true);
        Assert.assertTrue(safelist.isSafeAttribute("a", new Element("<a href='http://www.google.com'></a>"), new Attribute("href", "http://www.google.com")));
    }

    @Test
    public void isSafeTagFalseTest() {
        Safelist safelist = Safelist.none();
        Assert.assertFalse(safelist.isSafeTag("a"));
    }

    @Test
    public void isSafeAttributeFalseTest() {
        Safelist safelist = Safelist.none();
        Assert.assertFalse(safelist.isSafeAttribute("a", new Element("<a></a>"), new Attribute("href", "")));
    }

    @Test
    public void getEnforcedAttributesEmptyTest() {
        Safelist safelist = Safelist.none();
        Assert.assertTrue(safelist.getEnforcedAttributes("a").isEmpty());
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
    public void constructorWithSafelistTest() {
        Safelist safelist = new Safelist();
        Safelist copy = new Safelist(safelist);
        Assert.assertNotNull(copy);
    }

}