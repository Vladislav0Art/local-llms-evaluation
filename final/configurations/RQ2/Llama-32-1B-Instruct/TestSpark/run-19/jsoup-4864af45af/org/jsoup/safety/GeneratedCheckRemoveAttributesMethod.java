package org.jsoup.safety;

public class GeneratedCheckRemoveAttributesMethod {

    @Test
    public void checkRemoveAttributesMethod() {
        Safelist list = new Safelist();
        list.removeAttributes("a");
        Assert.assertEquals(1, list.getEnforcedAttributes("enforcer").size());
    }

}