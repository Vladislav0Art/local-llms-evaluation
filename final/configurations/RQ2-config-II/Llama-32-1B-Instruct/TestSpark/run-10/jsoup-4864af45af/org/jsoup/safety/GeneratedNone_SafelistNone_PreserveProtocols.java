package org.jsoup.safety;

public class GeneratedNone_SafelistNone_PreserveProtocols {

    @Test
    public void none_SafelistNone_PreserveProtocols() throws Exception {
        Safelist list = Safelist.none();
        List<String> protocols = Arrays.asList("rel", "title");
        String tag = "a";
        Assert.assertFalse(list.addProtocols(tag, protocols));
        Assert.assertTrue(list.isSafeTag("p"));
        Assert.assertFalse(list.getEnforcedAttributes(tag).containsKey(protocols.get(0)));
    }

}