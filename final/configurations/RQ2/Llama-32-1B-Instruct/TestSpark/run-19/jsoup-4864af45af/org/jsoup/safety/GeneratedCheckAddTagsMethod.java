package org.jsoup.safety;

public class GeneratedCheckAddTagsMethod {

    @Test
    public void checkAddTagsMethod() {
        Safelist list = new Safelist();
        String[] tags = {"img", "br"};
        for (String tag : tags) {
            list.addTags(tag, "");
        }
        Assert.assertEquals(2, list.getEnforcedAttributes("enforcer").size());
    }

}