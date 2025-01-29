package org.jsoup.safety;

public class GeneratedBasic_text_tags {

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
    public void basic_text_tags() {
        Element element = basic().addTags("a", "title");
        assertEquals(1, underTest.getEnforcedAttributes("tag").size());
        for (String tag : new String[]{"a", "title"}) {
            assertEquals("a", underTest.getEnforcedAttributes(tag).get(0).toString());
        }
    }

}