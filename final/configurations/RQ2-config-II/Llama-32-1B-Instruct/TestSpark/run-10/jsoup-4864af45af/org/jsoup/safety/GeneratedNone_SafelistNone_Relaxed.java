package org.jsoup.safety;

public class GeneratedNone_SafelistNone_Relaxed {

    @Test
    public void none_SafelistNone_Relaxed() throws Exception {
        Safelist list = Safelist.none();
        Assert.assertFalse(list.addTags("a", "img", true));
        Assert.assertTrue(list.removeTags("img", true));
        Assert.assertTrue(list.isSafeTag("p"));
        Assert.assertFalse(list.getEnforcedAttributes("img").containsKey("src"));
    }

}