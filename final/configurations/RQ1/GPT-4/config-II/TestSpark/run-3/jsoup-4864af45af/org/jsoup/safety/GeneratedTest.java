package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void HandleSafeTagTest() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("b"));
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void AddTagsWithNullOrEmptyTagNameTest() {
        Safelist safelist = Safelist.simpleText();
        safelist.addTags("");
    }

    @Test
    public void RemoveTagsWithNullOrEmptyTagNameTest() {
        Safelist safelist = Safelist.simpleText();
        safelist.removeTags("");
    }

    @Test
    public void PreserveRelativeLinksTest() {
        Safelist safelist = Safelist.simpleText();
        assertFalse(safelist.preserveRelativeLinks);
        safelist.preserveRelativeLinks(true);
        assertTrue(safelist.preserveRelativeLinks);
    }

    @Test
    public void AddAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("a").addAttributes("a", "href");
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "http://example.com")));
    }

    @Test
    public void AddAttributesWithNullOrEmptyTagNameTest() {
        Safelist safelist = Safelist.simpleText();
        safelist.addAttributes("", "id");
    }

    @Test
    public void RemoveAttributesWithNullOrEmptyTagNameTest() {
        Safelist safelist = Safelist.simpleText();
        safelist.removeAttributes("", "id");
    }

    @Test
    public void RemoveAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("a").addAttributes("a", "href");
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "http://example.com")));
        safelist.removeAttributes("a", "href");
        assertFalse(safelist.isSafeAttribute("a", null, new Attribute("href", "http://example.com")));
    }

    @Test
    public void AddEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("a").addEnforcedAttribute("a", "rel", "nofollow");
        Attributes attrs = safelist.getEnforcedAttributes("a");
        assertTrue(attrs.hasKey("rel"));
        Assert.assertEquals("nofollow", attrs.get("rel"));
    }

    @Test
    public void AddEnforcedAttributeWithNullOrEmptyTagNameTest() {
        Safelist safelist = Safelist.simpleText();
        safelist.addEnforcedAttribute("", "rel", "nofollow");
    }

    @Test
    public void RemoveEnforcedAttributeWithNullOrEmptyTagNameTest() {
        Safelist safelist = Safelist.simpleText();
        safelist.removeEnforcedAttribute("", "rel");
    }

    @Test
    public void RemoveEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("a").addEnforcedAttribute("a", "rel", "nofollow");
        Attributes attrs = safelist.getEnforcedAttributes("a");
        assertTrue(attrs.hasKey("rel"));
        Assert.assertEquals("nofollow", attrs.get("rel"));
        safelist.removeEnforcedAttribute("a", "rel");
        attrs = safelist.getEnforcedAttributes("a");
        assertFalse(attrs.hasKey("rel"));
    }

    @Test
    public void AddProtocolsTest() throws Exception {
        Safelist safelist = Safelist.none();
        safelist.addTags("a").addAttributes("a", "href");
        safelist.addProtocols("a", "href", "http", "https");
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "http://example.com")));
        assertFalse(safelist.isSafeAttribute("a", null, new Attribute("href", "ftp://example.com")));
    }

    @Test
    public void AddProtocolsWithNullOrEmptyTagNameTest() throws Exception {
        Safelist safelist = Safelist.simpleText();
        safelist.addProtocols("", "href", "http");
    }

    @Test
    public void RemoveProtocolsWithNullOrEmptyTagNameTest() throws Exception {
        Safelist safelist = Safelist.simpleText();
        safelist.removeProtocols("", "href", "http");
    }

    @Test
    public void RemoveProtocolsTest() throws Exception {
        Safelist safelist = Safelist.none();
        safelist.addTags("a").addAttributes("a", "href");
        safelist.addProtocols("a", "href", "http", "https", "ftp");
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "http://example.com")));
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "ftp://example.com")));
        safelist.removeProtocols("a", "href", "http");
        assertFalse(safelist.isSafeAttribute("a", null, new Attribute("href", "http://example.com")));
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "ftp://example.com")));
    }

}