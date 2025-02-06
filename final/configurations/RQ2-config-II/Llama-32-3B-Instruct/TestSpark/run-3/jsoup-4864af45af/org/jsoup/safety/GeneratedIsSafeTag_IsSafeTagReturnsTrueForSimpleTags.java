package org.jsoup.safety;

public class GeneratedIsSafeTag_IsSafeTagReturnsTrueForSimpleTags {

    @Test
    public void isSafeTag_IsSafeTagReturnsTrueForSimpleTags() {
        assertTrue(Safelist.simpleText().isSafeTag("p"));
    }

}