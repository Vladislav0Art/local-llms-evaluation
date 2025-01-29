package org.jsoup.safety;

public class GeneratedRelaxed_text_tags_with_relaxes {

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
    public void relaxed_text_tags_with_relaxes() {
        Safelist relaxes = new Relaxed();
        Element element = basic().addTags("", "class");
        element.addAttributes(relaxes.addAttribute("rel", "", ""));
        assertEquals(true, underTest.isSafeTag("text"));
    }

}