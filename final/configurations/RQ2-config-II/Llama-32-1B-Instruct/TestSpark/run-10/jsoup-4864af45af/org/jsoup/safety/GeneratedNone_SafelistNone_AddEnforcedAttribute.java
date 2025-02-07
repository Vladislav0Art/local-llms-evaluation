package org.jsoup.safety;

public class GeneratedNone_SafelistNone_AddEnforcedAttribute {

    @Test
    public void none_SafelistNone_AddEnforcedAttribute() throws Exception {
        Safelist list = Safelist.none();
        List<String> tags = Arrays.asList("a", "b");
        String attribute = "href";
        Assert.assertFalse(list.addAttributes("img", attribute, tags));
        Assert.assertTrue(list.isSafeTag("p"));
        Assert.assertFalse(list.getEnforcedAttributes("img").containsKey(attribute));
    }

}