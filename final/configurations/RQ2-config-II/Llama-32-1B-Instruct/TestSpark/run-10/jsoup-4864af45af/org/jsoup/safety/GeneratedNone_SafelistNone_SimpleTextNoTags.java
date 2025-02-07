package org.jsoup.safety;

public class GeneratedNone_SafelistNone_SimpleTextNoTags {

    @Test
    public void none_SafelistNone_SimpleTextNoTags() throws Exception {
        Safelist list = Safelist.none();
        Assert.assertTrue(list.isSafeTag("a"));
        Assert.assertFalse(list.isSafeTag("p"));
        Assert.assertTrue(list.getEnforcedAttributes("img").containsKey("src"));
    }

}