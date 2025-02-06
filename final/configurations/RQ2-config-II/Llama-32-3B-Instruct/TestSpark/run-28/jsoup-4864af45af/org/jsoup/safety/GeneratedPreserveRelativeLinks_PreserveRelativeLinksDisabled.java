package org.jsoup.safety;

public class GeneratedPreserveRelativeLinks_PreserveRelativeLinksDisabled {

    @Test
    public void preserveRelativeLinks_PreserveRelativeLinksDisabled() {
        Safelist safelist = Safelist.preserveRelativeLinks(false);
        assertNotSame(Safelist.relaxed(), safelist);
    }

}