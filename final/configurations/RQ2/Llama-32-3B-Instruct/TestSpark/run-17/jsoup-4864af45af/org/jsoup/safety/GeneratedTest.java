package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedTest {

    @Test
    public void none_isNone() {
        Safelist safelist = Safelist.none();
        assertNotNull(safelist);
        assertEquals(Safelist.none(), safelist);
    }

    @Test
    public void simpleText_isSimpleText() {
        Safelist safelist = Safelist.simpleText();
        assertNotNull(safelist);
        assertEquals(Safelist.simpleText(), safelist);
    }

    @Test
    public void basic_isBasic() {
        Safelist safelist = Safelist.basic();
        assertNotNull(safelist);
        assertEquals(Safelist.basic(), safelist);
    }

    @Test
    public void basicWithImages_addImageTag() {
        Safelist safelist = Safelist.basic().addTags("img");
        assertNotNull(safelist);
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void relaxed_addRelaxedTag() {
        Safelist safelist = Safelist.relaxed();
        assertNotNull(safelist);
        assertTrue(safelist.isSafeTag("rel"));
    }

    @Test
    public void addTags_addsTags() {
        Safelist safelist = Safelist.none().addTags("a", "b");
        assertNotNull(safelist);
        assertTrue(safelist.isSafeTag("a") && safelist.isSafeTag("b"));
    }

    @Test
    public void removeTags_removalOfTagsDoesNotNullify() {
        Safelist safelist = Safelist.addTags("img").removeTags("img");
        assertNotNull(safelist);
        assertFalse(safelist.isSafeTag("img"));
    }

    @Test
    public void addAttributes_addsAttributesForTag() {
        Safelist safelist = Safelist.simpleText().addAttributes("a", "href", "http://example.com");
        assertNotNull(safelist);
        assertEquals(1, ((HashMap<String, String>) safelist.getEnforcedAttributes("a")).size());
    }

    @Test
    public void removeAttributes_removalOfAttributesForTagDoesNotNullify() {
        Safelist safelist = Safelist.addAttributes("img", "src", "http://example.com").removeAttributes("img", "src");
        assertNotNull(safelist);
        assertFalse((Boolean) ((HashMap<String, String>) safelist.getEnforcedAttributes("img")).get("src"));
    }

    @Test
    public void addEnforcedAttribute_addsEnforcedAttributeForTag() {
        Safelist safelist = Safelist.simpleText().addEnforcedAttribute("a", "href", "http://example.com");
        assertNotNull(safelist);
        assertEquals(1, ((HashMap<String, String>) safelist.getEnforcedAttributes("a")).size());
    }

    @Test
    public void removeEnforcedAttribute_removalOfEnforcedAttributeForTagDoesNotNullify() {
        Safelist safelist = Safelist.addEnforcedAttribute("img", "src", "http://example.com").removeEnforcedAttribute("img", "src");
        assertNotNull(safelist);
        assertFalse((Boolean) ((HashMap<String, String>) safelist.getEnforcedAttributes("img")).get("src"));
    }

    @Test
    public void preserveRelativeLinks_preservationOfRelativeLinks() {
        Safelist safelist = Safelist.relaxed().preserveRelativeLinks(true);
        assertNotNull(safelist);
        assertTrue((Boolean) ((Map<String, Boolean>) safelist.getEnforcedAttributes("a")).get("rel"));
    }

    @Test
    public void addProtocols_addsProtocolsForTag() {
        Safelist safelist = Safelist.relaxed().addProtocols("a", "href", "http", "https");
        assertNotNull(safelist);
        assertEquals(2, ((Set<String>) safelist.getEnforcedAttributes("a")).size());
    }

    @Test
    public void removeProtocols_removalOfProtocolsForTagDoesNotNullify() {
        Safelist safelist = Safelist.addProtocols("img", "src", "http", "https").removeProtocols("img", "src");
        assertNotNull(safelist);
        assertFalse((Set<String>) safelist.getEnforcedAttributes("img"));
    }

    @Test
    public void isSafeTag_tagsAreSafeByDefault() {
        assertTrue(Safelist.basic().isSafeTag("a"));
    }

    @Test
    public void isSafeAttribute_attributeIsSafeForElement() {
        Safelist safelist = Safelist.relaxed();
        Element element = new Element();
        Attribute attribute = new Attribute();
        assertTrue(safelist.isSafeAttribute("rel", element, attribute));
    }

}