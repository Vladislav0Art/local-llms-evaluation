package org.jsoup.safety;

public class GeneratedTestSimpleText {

    @Test
    public void testSimpleText() throws Exception {
        Safelist simpleText = Safelist.simpleText();
        assertNotNull(simpleText);
        assertTrue(simpleText.isSafeTag("a"));
        assertFalse(simpleText.isSafeTag("script"));
    }

}