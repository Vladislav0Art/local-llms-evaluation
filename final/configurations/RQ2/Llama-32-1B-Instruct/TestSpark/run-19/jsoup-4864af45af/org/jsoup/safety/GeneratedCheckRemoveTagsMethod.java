package org.jsoup.safety;

public class GeneratedCheckRemoveTagsMethod {

    @Test
    public void checkRemoveTagsMethod() {
        Safelist list = new Safelist();
        list.removeTags("img");
        Assert.assertEquals(0, list.getEnforcedAttributes("enforcer").size());
    }

}