package org.jsoup.safety;

public class GeneratedNone_SafelistNone_PreserveRelativeLinks {

    @Test
    public void none_SafelistNone_PreserveRelativeLinks() throws Exception {
        Safelist list = Safelist.none();
        Assert.assertFalse(list.preserveRelativeLinks(false));
        Assert.assertTrue(list.isSafeTag("a"));
        Assert.assertFalse(list.getEnforcedAttributes("img").containsKey("src"));
    }

}