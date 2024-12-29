package org.jsoup.nodes;

public class GeneratedTestGetUserData {

    @Test
    public void testGetUserData() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object userData = "value";
        attributes.putUserData(key, userData);
        Assert.assertTrue(Attributes.getUserData(key).equals(userData));
    }

}