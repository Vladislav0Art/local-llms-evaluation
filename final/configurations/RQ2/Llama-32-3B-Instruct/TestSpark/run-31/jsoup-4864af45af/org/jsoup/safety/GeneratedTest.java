package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void noneIsNoneTest() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist instanceof Safelist);
    }

    @Test
    public void simpleTextReturnsSimpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist instanceof Safelist);
    }

    @Test
    public void basicReturnsBasicTest() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist instanceof Safelist);
    }

    @Test
    public void relaxedReturnsRelaxedTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist instanceof Safelist);
    }

    @Test
    public void basicAddTagsIsSafeTagTest() {
        Safelist safelist = Safelist.basic().addTags("img");
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void basicRemoveTagsNotSafeTagTest() {
        Safelist safelist = Safelist.basic().removeTags("script");
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void simpleTextAddAttributesIsSafeAttributeTest() {
        Safelist safelist = Safelist.simpleText().addAttributes("img", "src");
        assertTrue(((Map<String, String>) safelist.getEnforcedAttributes("img")).containsKey("src"));
    }

    @Test
    public void simpleTextRemoveAttributesNotSafeAttributeTest() {
        Safelist safelist = Safelist.simpleText().removeAttributes("script", "style");
        assertFalse(((Map<String, String>) safelist.getEnforcedAttributes("script")).containsKey("style"));
    }

    @Test
    public void basicAddProtocolsIsEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic().addProtocols("img", "src", new String[]{"http://example.com"});
        assertTrue(((Map<String, String>) safelist.getEnforcedAttributes("img")).containsKey("src"));
    }

    @Test
    public void basicRemoveProtocolsNotEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic().removeProtocols("script", "style", new String[]{"http://example.com"});
        assertFalse(((Map<String, String>) safelist.getEnforcedAttributes("script")).containsKey("style"));
    }

}