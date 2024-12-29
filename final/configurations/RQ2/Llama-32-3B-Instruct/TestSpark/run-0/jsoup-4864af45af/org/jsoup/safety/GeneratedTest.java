package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.safety.Safelist;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void none_SafeTagsIsEmpty() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag("html"));
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void basic_SimpleTextAndNoImages() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("img"));
    }

    @Test
    public void relaxed_RelaxedTagsWithImagesAllowed() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void none_NoAttributesAllowed() {
        Safelist safelist = Safelist.none();
        Attributes attributes = new Attributes();
        assertFalse(safelist.isSafeAttribute("div", null, null));
    }

    @Test
    public void basic_SimpleTextWithNoAttributes() {
        Safelist safelist = Safelist.basic();
        Attributes attributes = new Attributes();
        assertTrue(safelist.isSafeAttribute("p", null, attributes));
        assertFalse(safelist.isSafeAttribute("img", null, attributes));
    }

    @Test
    public void basicImageAllowed() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void none_NoEnforcedAttributesAllowed() {
        Safelist safelist = Safelist.none();
        Attributes attributes = new Attributes();
        assertFalse(safelist.getEnforcedAttributes(null).containsKey(attributes));
    }

    @Test
    public void simpleText_SimpleTextWithNoEnforcedAttributes() {
        Safelist safelist = Safelist.simpleText();
        Attributes attributes = new Attributes();
        assertTrue(safelist.getEnforcedAttributes(null).containsKey(attributes));
    }

    @Test
    public void basicBasicTagsWithEnforcedImageAttribute() {
        Safelist safelist = Safelist.basic();
        Attributes imageAttr = new Attributes("alt", "image");
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.getEnforcedAttributes("img").containsKey(imageAttr));
    }

    @Test
    public void none_NoTagsAllowed() {
        Safelist safelist = Safelist.none();
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void basicBasicImageWithNoProtocols() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeAttribute("img", null, new Attribute()));
    }

    @Test
    public void relaxedImagesAllowedWithProtocols() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeTag("img", Arrays.asList("http://example.com")));
    }

    @Test
    public void none_NoAttributesAllowedInImageTags() {
        Safelist safelist = Safelist.none();
        Attributes attributes = new Attributes();
        assertFalse(safelist.isSafeAttribute("img", null, attributes));
    }

    @Test
    public void simpleText_SimpleTextWithNoAttributesInImageTags() {
        Safelist safelist = Safelist.simpleText();
        Attributes attributes = new Attributes();
        assertTrue(safelist.isSafeAttribute("img", null, attributes));
    }

    @Test
    public void basicImagesAllowedWithoutProtocols() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeAttribute("img", null, new Attribute()));
    }

    @Test
    public void none_NoAttributesAllowedInScriptTags() {
        Safelist safelist = Safelist.none();
        Attributes attributes = new Attributes();
        assertFalse(safelist.isSafeAttribute("script", null, attributes));
    }

    @Test
    public void basic_SimpleTextWithNoAttributesInScriptTags() {
        Safelist safelist = Safelist.basic();
        Attributes attributes = new Attributes();
        assertTrue(safelist.isSafeAttribute("script", null, attributes));
    }

}