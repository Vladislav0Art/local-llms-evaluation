package org.jsoup.safety;

public class GeneratedIsSafeAttribute_IsSafeAttributeForBasicSafelist {

    @Test
    public void isSafeAttribute_IsSafeAttributeForBasicSafelist() {
        Safelist safelist = Safelist.relaxed();
        assertSame(false, safelist.isSafeAttribute(null, null, null));
    }

}