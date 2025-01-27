package org.jsoup.nodes;

public class GeneratedPut_UserDataKey_ExistingValue_ReturnsExistingValue {

    @Test
    public void put_UserDataKey_ExistingValue_ReturnsExistingValue() {
        Attributes attributes = new Attributes();
        Object userData = "existing value";
        Attribute attribute = new Attribute("key", userData);
        attributes.putUserData(attribute.getKey(), userData);
        assertTrue(attributes.hasKey(attribute.getKey()));
    }

}