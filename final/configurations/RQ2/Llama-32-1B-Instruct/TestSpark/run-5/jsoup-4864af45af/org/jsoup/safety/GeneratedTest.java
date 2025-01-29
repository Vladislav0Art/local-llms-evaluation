package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void testNone_Safelist() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void testSimpleText_Safelist() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.getEnforcedAttributes("text").contains("type"));
        assertFalse(safelist.getEnforcedAttributes("script"));
    }

    @Test
    public void testBasic_Safelist() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeAttribute("img", "src", "/image.jpg"));
        assertFalse(safelist.getEnforcedAttributes("script"));
    }

    @Test
    public void testBasicWithImages_Safelist() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeAttribute("img", "src", "/image.jpg"));
        assertFalse(safelist.getEnforcedAttributes("script"));
    }

    @Test
    public void testRelaxed_Safelist() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.getEnforcedAttributes("text").contains("type"));
        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeAttribute("script", "src", "/image.jpg"));
    }

    @Test
    public void testRelaxedWithImages_Safelist() {
        Safelist safelist = Safelist.relaxedWithImages();
        assertTrue(safelist.getEnforcedAttributes("text").contains("type"));
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeAttribute("img", "src", "/image.jpg"));
        assertFalse(safelist.getEnforcedAttributes("script"));
    }

    @Test
    public void testRelaxedWithImagesAndProtocols_Safelist() {
        Safelist safelist = Safelist.relaxedWithImages();
        assertTrue(safelist.getEnforcedAttributes("text").contains("type"));
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeAttribute("img", "src", "/image.jpg"));
        assertTrue(safelist.isSafeProtocol("script", "type", "text/javascript"));
    }

    @Test
    public void testRelaxedWithImagesAndProtocolsAndRemoveProtocols_Safelist() {
        Safelist safelist = Safelist.relaxedWithImages();
        assertTrue(safelist.getEnforcedAttributes("text").contains("type"));
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeAttribute("img", "src", "/image.jpg"));
        assertTrue(safelist.isSafeProtocol("script", "type", "text/javascript"));
        String[] removeProtocols = new String[]{};
        safelist.removeProtocols(removeProtocols);
        assertTrue(!safelist.getEnforcedAttributes("script").contains("type"));
    }

    @Test
    public void testRelaxedWithImagesAndRemoveProtocols_Safelist() {
        Safelist safelist = Safelist.relaxedWithImages();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeAttribute("img", "src", "/image.jpg"));
        assertTrue(safelist.isSafeProtocol("script", "type", "text/javascript"));
        String[] removeProtocols = new String[]{"type"};
        safelist.removeProtocols(removeProtocols);
        assertTrue(!safelist.isSafeTag("script"));
    }

    @Test
    public void testRelaxedWithImagesAndRemoveEnforcedAttribute_Safelist() {
        Safelist safelist = Safelist.relaxedWithImages();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.getEnforcedAttributes("text").contains("type"));
        String[] removeAttributes = new String[]{"src"};
        safelist.removeAttributes(removeAttributes);
        assertTrue(!safelist.isSafeAttribute("script", "src", "/image.jpg"));
    }

    @Test
    public void testRelaxedWithImagesAndRemoveEnforcedAttribute_Safelist() {
        Safelist safelist = Safelist.relaxedWithImages();
        assertTrue(safelist.getEnforcedAttributes("text").contains("type"));
        assertTrue(safelist.isSafeTag("img"));
        String[] removeAttributes = new String[]{"src"};
        safelist.removeAttributes(removeAttributes);
        assertFalse(safelist.getEnforcedAttributes("script"));
    }

    @Test
    public void testRelaxedWithImagesAndPreserveRelativeLinks_Safelist() {
        Safelist safelist = Safelist.relaxedWithImages();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeAttribute("img", "src", "/image.jpg"));
        assertTrue(safelist.getEnforcedAttributes("text").contains("type"));
        assertTrue(safelist.isSafeProtocol("script", "type", "text/javascript"));
    }

    @Test
    public void testRelaxedWithImagesAndPreserveRelativeLinks_Safelist() {
        Safelist safelist = Safelist.relaxedWithImages();
        assertTrue(safelist.getEnforcedAttributes("text").contains("type"));
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeAttribute("img", "src", "/image.jpg"));
        assertTrue(safelist.isSafeProtocol("script", "type", "text/javascript"));
    }

    @Test
    public void testRelaxedWithImagesAndRemoveEnforcedAttributes_Safelist() {
        Safelist safelist = Safelist.relaxedWithImages();
        assertTrue(safelist.getEnforcedAttributes("text").contains("type"));
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.getEnforcedAttributes("script").contains("type"));
        String[] removeAttributes = new String[]{"src"};
        safelist.removeAttributes(removeAttributes);
        assertTrue(!safelist.getEnforcedAttributes("image.jpg"));
    }

    @Test
    public void testRelaxedWithImagesAndRemoveEnforcedAttributes_Safelist() {
        Safelist safelist = Safelist.relaxedWithImages();
        assertTrue(safelist.getEnforcedAttributes("text").contains("type"));
        assertTrue(safelist.isSafeTag("img"));
        String[] removeAttributes = new String[]{"src"};
        safelist.removeAttributes(removeAttributes);
        assertFalse(safelist.getEnforcedAttributes("script"));
    }

}