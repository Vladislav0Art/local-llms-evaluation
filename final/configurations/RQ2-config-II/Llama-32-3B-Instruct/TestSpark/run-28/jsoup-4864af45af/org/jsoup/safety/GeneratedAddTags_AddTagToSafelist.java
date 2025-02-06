package org.jsoup.safety;

public class GeneratedAddTags_AddTagToSafelist {

    @Test
    public void addTags_AddTagToSafelist() {
        Safelist safelist = Safelist.basic();
        Safelist safelist1 = Safelist.addTags("b", "a");
        assertTrue(safelist1.isSafeTag("b"));
        assertTrue(safelist1.isSafeTag("a"));
    }

}