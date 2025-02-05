package org.jsoup.safety;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void noneTest() {
        Safelist result = Safelist.none();
        assertThat(result, is(notNullValue()));
    }

    @Test
    public void simpleTextTest() {
        Safelist result = Safelist.simpleText();
        assertThat(result, is(notNullValue()));
    }

    @Test
    public void basicTest() {
        Safelist result = Safelist.basic();
        assertThat(result, is(notNullValue()));
    }

    @Test
    public void basicWithImagesTest() {
        Safelist result = Safelist.basicWithImages();
        assertThat(result, is(notNullValue()));
    }

    @Test
    public void relaxedTest() {
        Safelist result = Safelist.relaxed();
        assertThat(result, is(notNullValue()));
    }

    @Test
    public void copyConstructorTest() {
        Safelist safelist = new Safelist();
        Safelist copiedSafelist = new Safelist(safelist);

        assertNotNull(copiedSafelist);
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("p", "div");

        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("div"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("p", "div");
        safelist.removeTags("div");

        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("div"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("div", "id", "class");

        assertTrue(safelist.isSafeAttribute("div", null, new Attribute("id", "value")));
        assertTrue(safelist.isSafeAttribute("div", null, new Attribute("class", "value")));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("div", "id", "class");
        safelist.removeAttributes("div", "id");

        assertFalse(safelist.isSafeAttribute("div", null, new Attribute("id", "value")));
        assertTrue(safelist.isSafeAttribute("div", null, new Attribute("class", "value")));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("div", "id", "value");

        Attributes attributes = safelist.getEnforcedAttributes("div");
        assertTrue(attributes.hasKey("id"));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("div", "id", "value");
        safelist.removeEnforcedAttribute("div", "id");

        Attributes attributes = safelist.getEnforcedAttributes("div");
        assertFalse(attributes.hasKey("id"));
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        safelist.preserveRelativeLinks(true);

        assertTrue(safelist.isPreserveRelativeLinks());
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "http", "https");

        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "http://example.com")));
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "https://example.com")));
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "http", "https");
        safelist.removeProtocols("a", "href", "http");

        assertFalse(safelist.isSafeAttribute("a", null, new Attribute("href", "http://example.com")));
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "https://example.com")));
    }

}