package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GeneratedTest {

    @Test
    public void none_SafelistIsNone() {
        assertSame(Safelist.none(), Safelist.none());
    }

    @Test
    public void simpleText_SimpleTextSafelist() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("a"));
        assertFalse(safelist.isSafeTag("img"));
    }

    @Test
    public void basic_BasicTagsAndAttributesAreAllowed() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeAttribute("a", null, null));
        assertTrue(safelist.isSafeAttribute("img", null, null));
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void basicWithImages_AddedTagsAreAllowed() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("a"));
        assertFalse(safelist.isSafeTag("img"));
    }

    @Test
    public void relaxed_RelaxedTagsAndAttributesAreAllowed() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeAttribute("script", null, null));
        assertTrue(safelist.isSafeTag("noscript"));
    }

    @Test
    public void preserveRelativeLinks_PreserveModePreservesLinks() {
        Safelist safelist = Safelist.preserveRelativeLinks(true);
        assertFalse(safelist.preserveRelativeLinks(false));
    }

    @Test
    public void addTags_AddedTagsAreAllowed() {
        Safelist safelist = Safelist.addTags("a", "img");
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void removeTags_RemovedTagsAreDisallowed() {
        Safelist safelist = Safelist.addTags("script", "noscript").removeTags("script", "noscript");
        assertFalse(safelist.isSafeTag("script"));
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void addAttributes_AddedAttributesAreAllowed() {
        Safelist safelist = Safelist.addAttributes("a", "href", "https://example.com");
        assertTrue(safelist.getEnforcedAttributes("a").containsKey("href"));
    }

    @Test
    public void removeAttributes_RemovedAttributesAreDisallowed() {
        Safelist safelist = Safelist.addAttributes("script", "src", "https://example.com").removeAttributes("script", "src");
        assertFalse(safelist.getEnforcedAttributes("script").containsKey("src"));
    }

    @Test
    public void addEnforcedAttribute_AddedEnforcedAttributesAreAllowed() {
        Safelist safelist = Safelist.addEnforcedAttribute("a", "href", "https://example.com");
        assertTrue(safelist.getEnforcedAttributes("a").containsKey("href"));
    }

    @Test
    public void removeEnforcedAttribute_RemovedEnforcedAttributesAreDisallowed() {
        Safelist safelist = Safelist.addEnforcedAttribute("script", "src", "https://example.com").removeEnforcedAttribute("script", "src");
        assertFalse(safelist.getEnforcedAttributes("script").containsKey("src"));
    }

    @Test
    public void addProtocols_AddedProtocolsAreAllowed() {
        Safelist safelist = Safelist.addProtocols("img", "src", "https://example.com", "http://example.net");
        assertTrue(safelist.getEnforcedAttributes("img").containsKey("src"));
        assertFalse(safelist.getEnforcedAttributes("img").containsKey("removeProtocol"));
    }

    @Test
    public void removeProtocols_RemovedProtocolsAreDisallowed() {
        Safelist safelist = Safelist.addProtocols("script", "src", "https://example.com", "http://example.net").removeProtocols("script", "src", "http://example.net");
        assertFalse(safelist.getEnforcedAttributes("script").containsKey("src"));
    }

    @Test
    public void isSafeTag_TagIsAllowed() {
        assertTrue(Safelist.relaxed().isSafeTag("p"));
        assertFalse(Safelist.relaxed().isSafeTag("script"));
    }

    @Test
    public void isSafeAttribute_AttributeIsAllowed() {
        assertTrue(Safelist.basicWithImages().isSafeAttribute("img", null, "src"));
        assertTrue(Safelist.relaxed().isSafeAttribute("noscript", null, null));
    }

    @Test
    public void getEnforcedAttributes_AttributesAreReturnedForTag() {
        Safelist safelist = Safelist.addTags("a").addAttributes("a", "href", "https://example.com");
        assertTrue(safelist.getEnforcedAttributes("a").containsKey("href"));
    }

}