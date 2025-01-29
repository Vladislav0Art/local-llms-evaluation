package org.jsoup.safety;

public class GeneratedTestSimpleText {

    @Test
    public void testSimpleText() {
        Safelist simpleText = org.jsoup.safety.Safelist.simpleText();
        assertEquals("simple_text", simpleText.getEnforcedAttributes("a"));
    }

}