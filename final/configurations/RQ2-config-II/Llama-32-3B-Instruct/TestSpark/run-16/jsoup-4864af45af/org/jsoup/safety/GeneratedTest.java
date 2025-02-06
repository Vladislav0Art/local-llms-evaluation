package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    @Test
    public void none_SafelistCreation() {
        Safelist safelist = Safelist.none();
        assertNotNull(safelist);
    }

    @Test
    public void simpleText_SafelistCreation() {
        Safelist safelist = Safelist.simpleText();
        assertNotNull(safelist);
    }

    @Test
    public void basic_SafelistCreation() {
        Safelist safelist = Safelist.basic();
        assertNotNull(safelist);
    }

    @Test
    public void basicWithImages_SafelistCreation() {
        Safelist safelist = Safelist.basicWithImages();
        assertNotNull(safelist);
    }

    @Test
    public void relaxed_SafelistCreation() {
        Safelist safelist = Safelist.relaxed();
        assertNotNull(safelist);
    }

    @Test
    public void newSafelistCopyFromExistingSafelist() {
        Safelist safelist1 = Safelist.basic();
        Safelist safelist2 = Safelist.copy(safelist1);
        assertNotNull(safelist2);
        assertEquals(safelist1, safelist2);
    }

    @Test
    public void addTags_SafelistModification() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("p", "div");
        assertNotNull(safelist);
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("div"));
    }

    @Test
    public void removeTags_SafelistModification() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("p", "div");
        safelist = Safelist.removeTags("p", "div");
        assertNotNull(safelist);
        assertFalse(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("div"));
    }

    @Test
    public void addAttributes_SafelistModification() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img", "alt");
        safelist = Safelist.addAttributes("img", "src", "https://example.com/image.jpg");
        assertNotNull(safelist);
        assertEquals(1, ((Attributes) safelist.getEnforcedAttributes("img")).size());
    }

    @Test
    public void removeAttributes_SafelistModification() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img", "alt");
        safelist = Safelist.removeAttributes("img", "src");
        assertNotNull(safelist);
        assertEquals(0, ((Attributes) safelist.getEnforcedAttributes("img")).size());
    }

    @Test
    public void addEnforcedAttribute_SafelistModification() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("a", "href");
        safelist = Safelist.addEnforcedAttribute("a", "href", "https://example.com");
        assertNotNull(safelist);
        assertEquals(1, ((Attributes) safelist.getEnforcedAttributes("a")).size());
    }

    @Test
    public void removeEnforcedAttribute_SafelistModification() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("a", "href");
        safelist = Safelist.removeEnforcedAttribute("a", "href");
        assertNotNull(safelist);
        assertEquals(0, ((Attributes) safelist.getEnforcedAttributes("a")).size());
    }

    @Test
    public void preserveRelativeLinks_SafelistModification() {
        Safelist safelist = Safelist.none();
        boolean originalPreserveRelativeLinks = Validate.preserveRelativeLinks;
        Validate.preserveRelativeLinks(true);
        safelist = Safelist.preserveRelativeLinks(true);
        Validate.preserveRelativeLinks(originalPreserveRelativeLinks);
        assertNotNull(safelist);
    }

    @Test
    public void addProtocols_SafelistModification() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img", "src");
        safelist = Safelist.addProtocols("img", "src", new String[]{"https:", "http:"});
        assertNotNull(safelist);
        assertEquals(2, ((Attributes) safelist.getEnforcedAttributes("img")).size());
    }

    @Test
    public void removeProtocols_SafelistModification() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img", "src");
        safelist = Safelist.removeProtocols("img", "src", new String[]{"https:"});
        assertNotNull(safelist);
        assertEquals(1, ((Attributes) safelist.getEnforcedAttributes("img")).size());
    }

}