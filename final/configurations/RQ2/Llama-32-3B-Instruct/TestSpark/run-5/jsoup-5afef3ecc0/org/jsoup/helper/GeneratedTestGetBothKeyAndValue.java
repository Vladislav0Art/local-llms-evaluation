package org.jsoup.helper;

public class GeneratedTestGetBothKeyAndValue {

    private String key;
    private String value;

    public PublicConnectionKeyVal(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

public class TestPublicConnectionKeyVal {

    @Test
    public void testGetBothKeyAndValue() {
        PublicConnectionKeyVal connectionKeyVal = new PublicConnectionKeyVal("key3", "value3");
        assertEquals("key3", connectionKeyVal.getKey());
        assertEquals("value3", connectionKeyVal.getValue());
    }

}