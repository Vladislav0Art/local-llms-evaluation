package org.jsoup.safety;

public class GeneratedRelaxed_text_with_relaxes_no_tags {

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
    public void relaxed_text_with_relaxes_no_tags() {
        Safelist relaxes = new Relaxed();
        Element element = none().addTags("", "class");
        element.addAttributes(relaxes.addAttribute("rel", "", ""));
        assertEquals(true, underTest.isSafeTag("text"));
    }

}