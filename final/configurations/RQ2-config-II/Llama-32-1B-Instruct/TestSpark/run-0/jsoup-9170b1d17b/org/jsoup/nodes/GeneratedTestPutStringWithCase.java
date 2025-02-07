package org.jsoup.nodes;

public class GeneratedTestPutStringWithCase {

    private Attributes attributes;

    @Test
    public void testPutStringWithCase() {
        String key = "TESTKEY";
        Object value = "value";
        attributes.put(StringUtil.lowerCase(key), value);
        assertEquals(value, attributes.getUserData(StringUtil.lowerCase(key)));
    }

}