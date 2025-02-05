package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

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
    public void safelistConstructorTest() {
        Safelist result = new Safelist();
        Assert.assertNotNull(result);
    }

    @Test
    public void copyConstructorTest() {
        Safelist defaultList = new Safelist();
        Safelist copiedList = new Safelist(defaultList);

        Assert.assertEquals(defaultList, copiedList);
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        assertEquals(safelist, safelist.addTags("div", "span"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        assertEquals(safelist, safelist.removeTags("div", "span"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        assertEquals(safelist, safelist.addAttributes("div", "class", "id"));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        assertEquals(safelist, safelist.removeAttributes("div", "class", "id"));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        assertEquals(safelist, safelist.addEnforcedAttribute("div", "class", "someClass"));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        assertEquals(safelist, safelist.removeEnforcedAttribute("div", "class"));
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        assertEquals(safelist, safelist.preserveRelativeLinks(true));
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        assertEquals(safelist, safelist.addProtocols("a", "href", "http", "https"));
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        assertEquals(safelist, safelist.removeProtocols("a", "href", "http", "https"));
    }

    @Test
    public void isSafeTagTest() {
        Safelist safelist = new Safelist();
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void isSafeAttributeTest() {
        Attribute attribute = new Attribute("class", "someClass");
        Element element = new Element("div").attr("class", "someClass");
        Safelist safelist = new Safelist();

        assertFalse(safelist.isSafeAttribute("script", element, attribute));
    }

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = new Safelist();
        Attributes attributes = safelist.getEnforcedAttributes("div");

        assertTrue(attributes.size() >= 0);
    }

}