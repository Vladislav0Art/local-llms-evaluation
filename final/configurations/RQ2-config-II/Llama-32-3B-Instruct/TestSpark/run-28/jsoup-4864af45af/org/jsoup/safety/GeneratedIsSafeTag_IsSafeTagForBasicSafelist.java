package org.jsoup.safety;

public class GeneratedIsSafeTag_IsSafeTagForBasicSafelist {

    @Test
    public void isSafeTag_IsSafeTagForBasicSafelist() {
        assertSame(true, Safelist.basic().isSafeTag("p"));
        assertSame(false, Safelist.relaxed().isSafeTag("script"));
    }

}