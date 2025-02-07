package org.jsoup.safety;

public class GeneratedNone_SafelistNone_RemoveEnforcedAttribute {

    @Test
    public void none_SafelistNone_RemoveEnforcedAttribute() throws Exception {
        Safelist list = Safelist.none();
        List<String> tags = Arrays.asList("a", "b");
        String attribute = "href";
        Assert.assertFalse(list.removeAttributes("img", attribute, tags));
        Assert.assertTrue(list.isSafeTag("p"));
        Assert.assertFalse(list.getEnforcedAttributes("img").containsKey(attribute));
    }

}