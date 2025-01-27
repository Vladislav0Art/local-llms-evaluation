package org.jsoup.safety;

public class GeneratedPreserveRelativeLinks_PreserveRelativeLinksByDefault {

    @Test
    public void preserveRelativeLinks_PreserveRelativeLinksByDefault() {
        Safelist safelist = Safelist.relaxed();
        safelist.preserveRelativeLinks(false);
        boolean preserveRelativeLinks = safelist.preserveRelativeLinks();
        Assert.assertTrue(preserveRelativeLinks);
    }

}