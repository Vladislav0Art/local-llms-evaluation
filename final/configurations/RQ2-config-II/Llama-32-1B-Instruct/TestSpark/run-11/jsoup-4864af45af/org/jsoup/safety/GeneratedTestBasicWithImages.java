package org.jsoup.safety;

public class GeneratedTestBasicWithImages {

    @Test
    public void testBasicWithImages() throws Exception {
        Safelist basicWithImages = Safelist.basicWithImages();
        assertNotNull(basicWithImages);
        assertTrue(basicWithImages.isSafeTag("img"));
        assertFalse(basicWithImages.isSafeTag("p"));
    }

}