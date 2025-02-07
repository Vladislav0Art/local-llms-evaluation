package org.jsoup.safety;

public class GeneratedRelaxed_SafelistRelaxed {

    @Test
    public void relaxed_SafelistRelaxed() {
        Safelist result = new Safelist().relaxed();
        assertTrue(result.relativelySimpleText().isSafeTag("a"));
        assertFalse(result.relativelySimpleText().isSafeTag("p"));
    }

}