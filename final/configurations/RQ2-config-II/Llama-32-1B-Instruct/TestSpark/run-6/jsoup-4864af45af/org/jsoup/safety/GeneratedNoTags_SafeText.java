package org.jsoup.safety;

public class GeneratedNoTags_SafeText {

    @Test
    public void noTags_SafeText() {
        Safelist result = new Safelist();
        assertTrue(result.simpleText().isSafe());
    }

}