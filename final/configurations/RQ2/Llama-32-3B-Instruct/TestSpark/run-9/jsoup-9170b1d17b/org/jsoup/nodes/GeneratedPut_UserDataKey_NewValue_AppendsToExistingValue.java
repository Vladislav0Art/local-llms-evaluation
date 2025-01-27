package org.jsoup.nodes;

public class GeneratedPut_UserDataKey_NewValue_AppendsToExistingValue {

    @Test
    public void put_UserDataKey_NewValue_AppendsToExistingValue() {
        Attributes attributes = new Attributes();
        Object userData = "existing value";
        Attribute attribute = new Attribute("key", userData);
        attributes.putUserData(attribute.getKey(), userData);
        String result = (String) attributes.getUserData(attribute.getKey());
        assertEquals(userData + ", existing value", result);
    }

}