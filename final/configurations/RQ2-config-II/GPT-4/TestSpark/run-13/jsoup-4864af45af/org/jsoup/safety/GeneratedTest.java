package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertNotSame(result, safelist);
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.addTags("a", "b");
        Assert.assertEquals(safelist, result);
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("a", "b");
        Safelist result = safelist.removeTags("a");
        Assert.assertEquals(safelist, result);
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.addAttributes("a", "href", "src");
        Assert.assertEquals(safelist, result);
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href", "src");
        Safelist result = safelist.removeAttributes("a", "href");
        Assert.assertEquals(safelist, result);
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.addEnforcedAttribute("a", "href", "http://");
        Assert.assertEquals(safelist, result);
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("a", "href", "http://");
        Safelist result = safelist.removeEnforcedAttribute("a", "href");
        Assert.assertEquals(safelist, result);
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.preserveRelativeLinks(true);
        Assert.assertEquals(safelist, result);
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.addProtocols("a", "href", "http");
        Assert.assertEquals(safelist, result);
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "http");
        Safelist result = safelist.removeProtocols("a", "href", "http");
        Assert.assertEquals(safelist, result);
    }

    @Test
    public void isSafeTagTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("a");
        boolean result = safelist.isSafeTag("a");
        Assert.assertTrue(result);
    }

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href");
        Element el = new Element("a");
        el.appendChild(new TextNode("test"));
        boolean result = safelist.isSafeAttribute("a", el, el.attributes().get(0));
        Assert.assertTrue(result);
    }

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("a", "href", "http://");
        Attributes result = safelist.getEnforcedAttributes("a");
        Assert.assertNotNull(result.get("href"));
    }

}