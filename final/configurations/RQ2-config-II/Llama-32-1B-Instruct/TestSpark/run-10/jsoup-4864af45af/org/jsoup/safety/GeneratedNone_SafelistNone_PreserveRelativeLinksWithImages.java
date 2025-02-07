package org.jsoup.safety;

public class GeneratedNone_SafelistNone_PreserveRelativeLinksWithImages {

    @Test
    public void none_SafelistNone_PreserveRelativeLinksWithImages() throws Exception {
        Safelist list = Safelist.none();
        Assert.assertFalse(list.preserveRelativeLinks(true));
        Assert.assertTrue(list.removeTags("img", true, "removeProtocols"));
        Assert.assertTrue(list.isSafeTag("p"));
        Assert.assertFalse(list.getEnforcedAttributes("img").containsKey("src"));
    }

}