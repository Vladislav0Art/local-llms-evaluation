package org.jsoup.safety;

public class GeneratedNone_test {

    private Safelist underTest;
    private Safelist none;
    private Safelist simpleText;
    private Safelist basic;
    private Safelist basicWithImages;
    private Safelist relaxed;

    @Before
    public void setup() {
        this.none = Safelist.none();
        this.simpleText = Safelist.simpleText();
        this.basic = Safelist.basic();
        this.basicWithImages = Safelist.basicWithImages();
        this.relativelySafe = new Safelist(); // placeholder for relaxes
    }

    @Test
    public void none_test() {
        assertEquals(false, underTest.isSafeTag("tag"));
    }

}