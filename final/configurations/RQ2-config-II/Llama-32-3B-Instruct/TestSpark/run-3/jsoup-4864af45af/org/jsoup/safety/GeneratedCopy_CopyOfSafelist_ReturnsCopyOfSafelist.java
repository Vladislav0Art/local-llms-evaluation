package org.jsoup.safety;

public class GeneratedCopy_CopyOfSafelist_ReturnsCopyOfSafelist {

    @Test
    public void copy_CopyOfSafelist_ReturnsCopyOfSafelist() {
        Safelist safelist = new Safelist(Safelist.simpleText());
        Safelist copy = safelist.copy();
        assertEquals(safelist, copy);
    }

}