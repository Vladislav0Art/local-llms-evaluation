package org.jsoup.safety;

public class GeneratedPreserveRelativeLinks_PreserveRelativeLinksReturnsNewSafelistWithPreservedRelativeLinks {

    @Test
    public void preserveRelativeLinks_PreserveRelativeLinksReturnsNewSafelistWithPreservedRelativeLinks() {
        Safelist safelist = new Safelist(Safelist.simpleText()).preserveRelativeLinks(false);
        assertFalse(safelist.isSafeAttribute(null, null, null));
    }

}