package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void none() {
        Safelist safelist = Safelist.none();
        assertNotNull(safelist);
    }

    @Test
    public void simpleText() {
        Safelist safelist = Safelist.simpleText();
        assertNotNull(safelist);
        assertTrue(safelist.isSafeTag("span"));
    }

    @Test
    public void basic() {
        Safelist safelist = Safelist.basic();
        assertNotNull(safelist);
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void basicWithImages() {
        Safelist safelist = Safelist.basicWithImages();
        assertNotNull(safelist);
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void relaxed() {
        Safelist safelist = Safelist.relaxed();
        assertNotNull(safelist);
        assertTrue(safelist.isSafeTag("a"));
    }

    @Test
    public void noneWithTags() {
        Safelist safelist = Safelist.none().addTags("a", "b");
        assertNotNull(safelist);
    }

    @Test
    public void removeTags() {
        Safelist safelist = Safelist.simpleText();
        String[] tagsToRemove = {"img"};
        safelist.removeTags(tagsToRemove);
        assertTrue(safelist.isSafeTag("span"));
    }

    @Test
    public void addTags() {
        Safelist safelist = Safelist.none().addTags("a", "b");
        safelist.addTags("c", "d");
        assertNotNull(safelist);
    }

    @Test
    public void removeTagsWithNonExistingTag() {
        Safelist safelist = Safelist.simpleText();
        String[] tagsToRemove = {"nonExistent"};
        safelist.removeTags(tagsToRemove);
        assertFalse(safelist.isSafeTag("span"));
    }

    @Test
    public void addAttributes() {
        Safelist safelist = Safelist.basicWithImages();
        safelist.addAttributes("class", "style");
        String[] attributes = {"id", "href"};
        safelist.addAttributes(attributes);
        assertNotNull(safelist.getEnforcedAttributes("img"));
    }

    @Test
    public void removeAttributes() {
        Safelist safelist = Safelist.basicWithImages();
        safelist.removeAttributes("class");
        assertTrue(safelist.getEnforcedAttributes("img"));
    }

    @Test
    public void addEnforcedAttribute() {
        Safelist safelist = Safelist.simpleText();
        safelist.addEnforcedAttribute("a", "href", "#top");
        String attribute = "href";
        String value = "top";
        safelist.addEnforcedAttribute(attribute, value);
        assertNotNull(safelist.getEnforcedAttributes("a"));
    }

    @Test
    public void removeEnforcedAttribute() {
        Safelist safelist = Safelist.simpleText();
        String tag = "a";
        String attribute = "href";
        safelist.removeEnforcedAttribute(tag, attribute);
        assertFalse(safelist.isSafeTag(tag));
    }

    @Test
    public void preserveRelativeLinks() {
        Safelist safelist = Safelist.basicWithImages();
        safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void addProtocols() {
        Safelist safelist = Safelist.basicWithImages();
        safelist.addProtocols("a", "href", "#top");
        String protocol = "href";
        String value = "top";
        safelist.addProtocols(protocol, value);
        assertNotNull(safelist.getEnforcedAttributes(protocol));
    }

    @Test
    public void removeProtocols() {
        Safelist safelist = Safelist.basicWithImages();
        safelist.removeProtocols("a", "#top");
        assertTrue(safelist.getEnforcedAttributes("href"));
    }

}