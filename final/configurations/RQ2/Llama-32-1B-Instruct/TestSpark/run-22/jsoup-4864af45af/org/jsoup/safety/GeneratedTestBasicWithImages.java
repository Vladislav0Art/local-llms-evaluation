package org.jsoup.safety;

public class GeneratedTestBasicWithImages {

    @Test
    public void testBasicWithImages() {
        Safelist basicWithImages = org.jsoup.safety.Safelist.basicWithImages();
        assertEquals("basic_with_images", basicWithImages.getEnforcedAttributes("img"));
    }

}