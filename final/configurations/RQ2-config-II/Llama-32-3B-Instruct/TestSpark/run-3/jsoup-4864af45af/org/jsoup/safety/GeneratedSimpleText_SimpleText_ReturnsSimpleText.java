package org.jsoup.safety;

public class GeneratedSimpleText_SimpleText_ReturnsSimpleText {

    @Test
    public void simpleText_SimpleText_ReturnsSimpleText() {
        Safelist safelist = Safelist.simpleText();
        assertSame(safelist, Safelist.simpleText());
    }

}