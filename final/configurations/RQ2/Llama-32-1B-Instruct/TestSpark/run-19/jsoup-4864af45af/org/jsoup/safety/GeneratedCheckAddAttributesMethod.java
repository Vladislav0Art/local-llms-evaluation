package org.jsoup.safety;

public class GeneratedCheckAddAttributesMethod {

    @Test
    public void checkAddAttributesMethod() {
        Safelist list = new Safelist();
        String[] tags = {"a"};
        for (String tag : tags) {
            list.addAttributes(tag, "href", "url");
        }
        Assert.assertEquals(2, list.getEnforcedAttributes("enforcer").size());
    }

}