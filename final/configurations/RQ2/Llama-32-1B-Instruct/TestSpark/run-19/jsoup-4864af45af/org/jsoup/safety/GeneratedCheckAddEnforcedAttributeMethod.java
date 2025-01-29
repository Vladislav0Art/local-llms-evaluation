package org.jsoup.safety;

public class GeneratedCheckAddEnforcedAttributeMethod {

    @Test
    public void checkAddEnforcedAttributeMethod() {
        Safelist list = new Safelist();
        String tag = "a";
        String attribute = "title";
        String value = "value";
        list.addEnforcedAttribute(tag, attribute, value);
        Assert.assertEquals(1, list.getEnforcedAttributes("enforcer").size());
    }

}