package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.HashSet;

public class GeneratedTest {

    @Test
    public void none_SafelistCreatedTest() {
        Safelist safelist = Safelist.none();
        assertNotNull(safelist);
    }

    @Test
    public void simpleText_SimpleTextAddedTest() {
        Safelist safelist = Safelist.simpleText();
        Set<String> expectedTags = new HashSet<>();
        expectedTags.add("text");
        assertTrue(safelist.addTags(expectedTags).isSafeTag("text"));
    }

    @Test
    public void basic_BasicElementsAddedTest() {
        Safelist safelist = Safelist.basic();
        Set<String> expectedTags = new HashSet<>();
        expectedTags.add("img", "br", "p");
        assertTrue(safelist.addTags(expectedTags).isSafeTag("img"));
    }

    @Test
    public void basicImagesImagesAddedTest() {
        Safelist safelist = Safelist.basic();
        Set<String> expectedTags = new HashSet<>();
        expectedTags.add("img");
        assertTrue(safelist.addTags(expectedTags).isSafeTag("img"));
    }

    @Test
    public void relaxed_RelaxedElementsAddedTest() {
        Safelist safelist = Safelist.relaxed();
        Set<String> expectedTags = new HashSet<>();
        expectedTags.add("img", "br");
        assertTrue(safelist.addTags(expectedTags).isSafeTag("img"));
    }

    @Test
    public void noneRemoveTags_EmptySetRemovesAllTagsTest() {
        Safelist safelist = Safelist.none();
        Set<String> tags = new HashSet<>();
        Safelist newSafelist = safelist.removeTags(tags);
        assertTrue(newSafelist.isSafeTag(""));
    }

    @Test
    public void basicRemoveTags_BasicElementsRemovesBasicTagsTest() {
        Safelist safelist = Safelist.basic();
        Set<String> expectedTags = new HashSet<>();
        expectedTags.add("img", "br");
        Safelist newSafelist = safelist.removeTags(expectedTags);
        assertFalse(newSafelist.isSafeTag("img"));
    }

    @Test
    public void addTags_NoArgumentsAddsNoTagsTest() {
        Safelist safelist = Safelist.none();
        Set<String> expectedTags = new HashSet<>();
        Safelist newSafelist = safelist.addTags(expectedTags);
        assertFalse(newSafelist.isSafeTag(""));
    }

    @Test
    public void removeTags_EmptySetRemovesAllTagsTest() {
        Safelist safelist = Safelist.none();
        Set<String> tags = new HashSet<>();
        Safelist newSafelist = safelist.removeTags(tags);
        assertTrue(newSafelist.isSafeTag(""));
    }

    @Test
    public void addAttributes_AddedAttributePreservesAttrValueTest() {
        Safelist safelist = Safelist.basic();
        Set<String> expectedAttributes = new HashSet<>();
        expectedAttributes.add("alt", "123");
        Safelist newSafelist = safelist.addAttributes(expectedAttributes);
        assertEquals(123L, (long) newSafelist.getEnforcedAttributes("img").get("alt"));
    }

    @Test
    public void removeAttributes_RemovedAttributePreservesAttrValueTest() {
        Safelist safelist = Safelist.basic();
        Set<String> expectedAttributes = new HashSet<>();
        expectedAttributes.add("alt", "123");
        Safelist newSafelist = safelist.removeAttributes(expectedAttributes);
        assertEquals(123L, (long) newSafelist.getEnforcedAttributes("img").get("alt"));
    }

    @Test
    public void preserveRelativeLinks_PreserveLinkPreservesLinkValueTest() {
        Safelist safelist = Safelist.relaxed();
        Set<String> expectedProtocols = new HashSet<>();
        expectedProtocols.add("http");
        Safelist newSafelist = safelist.addProtocols("img", "href", expectedProtocols);
        assertEquals("http://example.com", (String) newSafelist.getEnforcedAttributes("img").get("href"));
    }

    @Test
    public void addProtocols_AddedProtocolPreservesAttrValueTest() {
        Safelist safelist = Safelist.none();
        Set<String> expectedTags = new HashSet<>();
        expectedTags.add("img", "br");
        Safelist newSafelist = newSafelist.addProtocols(expectedTags, "href", "http://example.com");
        assertEquals("http://example.com", (String) newSafelist.getEnforcedAttributes("img").get("href"));
    }

    @Test
    public void removeProtocols_RemovedProtocolPreservesAttrValueTest() {
        Safelist safelist = Safelist.none();
        Set<String> expectedTags = new HashSet<>();
        expectedTags.add("img", "br");
        Safelist newSafelist = newSafelist.removeProtocols(expectedTags, "href", new HashSet<>());
        assertEquals(123L, (long) newSafelist.getEnforcedAttributes("img").get("alt"));
    }

    @Test
    public void isSafeTag_SafeTagsReturnsTrueTest() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void isSafeAttribute_SafeTagsReturnsTrueTest() {
        Safelist safelist = Safelist.relaxed();
        assertFalse(safelist.isSafeAttribute("script", new Element(), new Attribute()));
    }

}