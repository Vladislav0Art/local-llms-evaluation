package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void none_SafelistCreated() {
        Safelist safelist = Safelist.none();
        assertNotNull(safelist);
    }

    @Test
    public void simpleText_SafelistCreated() {
        Safelist safelist = Safelist.simpleText();
        assertNotNull(safelist);
    }

    @Test
    public void basic_SafelistCreated() {
        Safelist safelist = Safelist.basic();
        assertNotNull(safelist);
    }

    @Test
    public void basicWithImages_SafelistCreated() {
        Safelist safelist = Safelist.basicWithImages();
        assertNotNull(safelist);
    }

    @Test
    public void relaxed_SafelistCreated() {
        Safelist safelist = Safelist.relaxed();
        assertNotNull(safelist);
    }

    @Test
    public void copy_SafelistCopiedFromAnotherSafelist() {
        Safelist safelist1 = Safelist.simpleText();
        Safelist safelist2 = new Safelist(safelist1);
        assertEquals(safelist1, safelist2);
    }

    @Test
    public void addTagsAddNewTagsToSafelist() {
        Safelist safelist = Safelist.none();
        Safelist safelistWithTags = safelist.addTags("img", "a");
        assertNotNull(safelistWithTags);
        assertTrue(safelistWithTags.isSafeTag("img"));
    }

    @Test
    public void addTags_DoesNotModifyExistingTags() {
        Safelist safelist = Safelist.simpleText();
        Safelist safelistWithTags = safelist.addTags("img", "a");
        assertFalse(safelistWithTags.isSafeAttribute("img", null, null));
    }

    @Test
    public void removeTagsRemovesTagsFromSafelist() {
        Safelist safelist = Safelist.simpleText();
        Safelist safelistWithoutTags = safelist.removeTags("img");
        assertNotNull(safelistWithoutTags);
        assertFalse(safelistWithoutTags.isSafeTag("img"));
    }

    @Test
    public void addAttributesAddNewAttributesToSafelist() {
        Safelist safelist = Safelist.none();
        Safelist safelistWithAttributes = safelist.addAttributes("a", "href");
        assertNotNull(safelistWithAttributes);
        assertEquals(1, ((Attributes) safelistWithAttributes.getEnforcedAttributes("a")).size());
    }

    @Test
    public void addAttributesDoesNotModifyExistingAttributes() {
        Safelist safelist = Safelist.simpleText();
        Safelist safelistWithAttributes = safelist.addAttributes("img", "src");
        assertEquals(1, ((Attributes) safelist.getEnforcedAttributes("img")).size());
    }

    @Test
    public void removeAttributesRemovesAttributesFromSafelist() {
        Safelist safelist = Safelist.simpleText();
        Safelist safelistWithoutAttributes = safelist.removeAttributes("img", "src");
        assertNotNull(safelistWithoutAttributes);
        assertEquals(0, ((Attributes) safelistWithoutAttributes.getEnforcedAttributes("img")).size());
    }

    @Test
    public void preserveRelativeLinksPreservesLinkFormat() {
        Safelist safelist = Safelist.none();
        Safelist safelistWithRelativeLinks = safelist.preserveRelativeLinks(true);
        assertTrue(safelistWithRelativeLinks.isSafeAttribute(null, null, null));
    }

    @Test
    public void addProtocolsAddNewProtocolsToSafelist() {
        Safelist safelist = Safelist.none();
        Safelist safelistWithProtocols = safelist.addProtocols("a", "href");
        assertNotNull(safelistWithProtocols);
        assertEquals(1, ((Attributes) safelistWithProtocols.getEnforcedAttributes("a")).size());
    }

    @Test
    public void addProtocolsDoesNotModifyExistingProtocols() {
        Safelist safelist = Safelist.simpleText();
        Safelist safelistWithProtocols = safelist.addProtocols("img", "src");
        assertEquals(1, ((Attributes) safelist.getEnforcedAttributes("img")).size());
    }

    @Test
    public void removeProtocolsRemovesProtocolsFromSafelist() {
        Safelist safelist = Safelist.simpleText();
        Safelist safelistWithoutProtocols = safelist.removeProtocols("a", "href");
        assertNotNull(safelistWithoutProtocols);
        assertEquals(0, ((Attributes) safelistWithoutProtocols.getEnforcedAttributes("a")).size());
    }

    @Test
    public void isSafeTag_SafeTagsAreReturnAsTrue() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void isSafeAttribute_ReturnsFalseWhenAttributeIsNotSafe() {
        Safelist safelist = Safelist.none();
        assertFalse(safelist.isSafeAttribute(null, null, new Attribute()));
    }

}