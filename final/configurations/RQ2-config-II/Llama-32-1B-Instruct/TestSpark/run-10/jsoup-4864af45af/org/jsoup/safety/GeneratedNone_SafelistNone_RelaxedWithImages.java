package org.jsoup.safety;

public class GeneratedNone_SafelistNone_RelaxedWithImages {

    @Test
    public void none_SafelistNone_RelaxedWithImages() throws Exception {
        Safelist list = Safelist.none();
        Assert.assertFalse(list.addTags("a", "img", true));
        Assert.assertTrue(list.removeTags("img", true, "removeProtocols"));
        Assert.assertTrue(list.isSafeTag("p"));
        Assert.assertFalse(list.getEnforcedAttributes("img").containsKey("src"));
    }

}