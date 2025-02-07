package org.jsoup.safety;

public class GeneratedNone_SafelistNone_PreserveProtocolsWithImages {

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