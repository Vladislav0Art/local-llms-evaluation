package org.jsoup.safety;

public class GeneratedNone_SafelistNone_SimpleTextWithImages {

    @Test
    public void none_SafelistNone_SimpleTextWithImages() throws Exception {
        Safelist list = Safelist.none();
        Assert.assertFalse(list.addTags("a", "img"));
        Assert.assertTrue(list.removeTags("img"));
        Assert.assertTrue(list.isSafeTag("p"));
        Assert.assertFalse(list.getEnforcedAttributes("img").containsKey("src"));
    }

}