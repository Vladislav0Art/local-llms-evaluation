package org.jsoup.helper;

public class GeneratedTestGetValue {

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
    public void testGetValue() {
        PublicConnectionKeyVal connectionKeyVal = new PublicConnectionKeyVal("key2", "value2");
        assertEquals("value2", connectionKeyVal.getValue());
    }

}