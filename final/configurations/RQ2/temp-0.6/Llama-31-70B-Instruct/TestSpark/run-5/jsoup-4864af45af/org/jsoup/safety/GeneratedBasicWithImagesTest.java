package org.jsoup.safety;

public class GeneratedBasicWithImagesTest {

    private Safelist safelist;

    @Before
    public void setUp() {
        safelist = new Safelist();
    }

    @Test
    public void basicWithImagesTest() {
        Safelist basicWithImages = Safelist.basicWithImages();
        assertEquals(basicWithImages.getTags().size(), 7);
        assertEquals(basicWithImages.getTags().get(0), "a");
        assertEquals(basicWithImages.getTags().get(1), "p");
        assertEquals(basicWithImages.getTags().get(2), "br");
        assertEquals(basicWithImages.getTags().get(3), "div");
        assertEquals(basicWithImages.getTags().get(4), "img");
        assertEquals(basicWithImages.getTags().get(5), "span");
        assertEquals(basicWithImages.getTags().get(6), "img");
    }

}