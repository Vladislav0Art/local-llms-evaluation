package org.jsoup.safety;

public class GeneratedNone_SafelistNone_NoImageTags {

    @Test
    public void none_SafelistNone_NoImageTags() throws Exception {
        Safelist list = Safelist.none();
        Assert.assertFalse(list.addTags("a", "img"));
        Assert.assertFalse(list.removeTags("img"));
        Assert.assertTrue(list.isSafeTag("p"));
        Assert.assertFalse(list.getEnforcedAttributes("img").containsKey("src"));
    }

}