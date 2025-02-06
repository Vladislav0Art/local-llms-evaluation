package org.jsoup.safety;

public class GeneratedPreserveRelativeLinks_PreserveRelativeLinks {

    @Test
    public void preserveRelativeLinks_PreserveRelativeLinks() {
        Safelist safelist = Safelist.preserveRelativeLinks(true);
        assertSame(Safelist.relaxed(), safelist);
    }

}