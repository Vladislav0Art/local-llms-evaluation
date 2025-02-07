package org.jsoup.safety;

public class GeneratedTest {

    @Test
    public void none_SafelistNone_SimpleTextNoTags() throws Exception {
        Safelist list = Safelist.none();
        Assert.assertTrue(list.isSafeTag("a"));
        Assert.assertFalse(list.isSafeTag("p"));
        Assert.assertTrue(list.getEnforcedAttributes("img").containsKey("src"));
    }

    @Test
    public void none_SafelistNone_NoImageTags() throws Exception {
        Safelist list = Safelist.none();
        Assert.assertFalse(list.addTags("a", "img"));
        Assert.assertFalse(list.removeTags("img"));
        Assert.assertTrue(list.isSafeTag("p"));
        Assert.assertFalse(list.getEnforcedAttributes("img").containsKey("src"));
    }

    @Test
    public void none_SafelistNone_SimpleTextWithImages() throws Exception {
        Safelist list = Safelist.none();
        Assert.assertFalse(list.addTags("a", "img"));
        Assert.assertTrue(list.removeTags("img"));
        Assert.assertTrue(list.isSafeTag("p"));
        Assert.assertFalse(list.getEnforcedAttributes("img").containsKey("src"));
    }

    @Test
    public void none_SafelistNone_Relaxed() throws Exception {
        Safelist list = Safelist.none();
        Assert.assertFalse(list.addTags("a", "img", true));
        Assert.assertTrue(list.removeTags("img", true));
        Assert.assertTrue(list.isSafeTag("p"));
        Assert.assertFalse(list.getEnforcedAttributes("img").containsKey("src"));
    }

    @Test
    public void none_SafelistNone_RelaxedWithImages() throws Exception {
        Safelist list = Safelist.none();
        Assert.assertFalse(list.addTags("a", "img", true));
        Assert.assertTrue(list.removeTags("img", true, "removeProtocols"));
        Assert.assertTrue(list.isSafeTag("p"));
        Assert.assertFalse(list.getEnforcedAttributes("img").containsKey("src"));
    }

    @Test
    public void none_SafelistNone_PreserveRelativeLinks() throws Exception {
        Safelist list = Safelist.none();
        Assert.assertFalse(list.preserveRelativeLinks(false));
        Assert.assertTrue(list.isSafeTag("a"));
        Assert.assertFalse(list.getEnforcedAttributes("img").containsKey("src"));
    }

    @Test
    public void none_SafelistNone_PreserveRelativeLinksWithImages() throws Exception {
        Safelist list = Safelist.none();
        Assert.assertFalse(list.preserveRelativeLinks(true));
        Assert.assertTrue(list.removeTags("img", true, "removeProtocols"));
        Assert.assertTrue(list.isSafeTag("p"));
        Assert.assertFalse(list.getEnforcedAttributes("img").containsKey("src"));
    }

    @Test
    public void none_SafelistNone_AddEnforcedAttribute() throws Exception {
        Safelist list = Safelist.none();
        List<String> tags = Arrays.asList("a", "b");
        String attribute = "href";
        Assert.assertFalse(list.addAttributes("img", attribute, tags));
        Assert.assertTrue(list.isSafeTag("p"));
        Assert.assertFalse(list.getEnforcedAttributes("img").containsKey(attribute));
    }

    @Test
    public void none_SafelistNone_RemoveEnforcedAttribute() throws Exception {
        Safelist list = Safelist.none();
        List<String> tags = Arrays.asList("a", "b");
        String attribute = "href";
        Assert.assertFalse(list.removeAttributes("img", attribute, tags));
        Assert.assertTrue(list.isSafeTag("p"));
        Assert.assertFalse(list.getEnforcedAttributes("img").containsKey(attribute));
    }

    @Test
    public void none_SafelistNone_PreserveProtocols() throws Exception {
        Safelist list = Safelist.none();
        List<String> protocols = Arrays.asList("rel", "title");
        String tag = "a";
        Assert.assertFalse(list.addProtocols(tag, protocols));
        Assert.assertTrue(list.isSafeTag("p"));
        Assert.assertFalse(list.getEnforcedAttributes(tag).containsKey(protocols.get(0)));
    }

    @Test
    public void none_SafelistNone_PreserveProtocolsWithImages() throws Exception {
        Safelist list = Safelist.none();
        List<String> protocols = Arrays.asList("rel", "title");
        String tag = "img";
        Assert.assertFalse(list.removeProtocols(tag, protocols));
        Assert.assertTrue(list.isSafeTag("p"));
        Assert.assertFalse(list.getEnforcedAttributes(tag).containsKey(protocols.get(0)));
    }

}