package org.jsoup.safety;

public class GeneratedRemoveTags_RemoveTagFromSafelist {

    @Test
    public void removeTags_RemoveTagFromSafelist() {
        Safelist safelist = Safelist.basicWithImages();
        Safelist safelist1 = Safelist.removeTags("img");
        assertFalse(safelist1.isSafeTag("img"));
    }

}