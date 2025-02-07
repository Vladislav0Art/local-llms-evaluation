package org.jsoup.safety;

public class GeneratedSimpleText_SimpleTag {

    @Test
    public void simpleText_SimpleTag() {
        Safelist result = new Safelist();
        assertTrue(result.simpleText().isSafeTag("a"));
        assertFalse(result.simpleText().isSafeTag("p"));
    }

}