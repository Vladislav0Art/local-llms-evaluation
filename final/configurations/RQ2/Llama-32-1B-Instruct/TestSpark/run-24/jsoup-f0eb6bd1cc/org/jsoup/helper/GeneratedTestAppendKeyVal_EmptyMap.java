package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_EmptyMap {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        // TO DO: add necessary setup for test cases
    }

    @Test
    public void testAppendKeyVal_EmptyMap() throws UnsupportedEncodingException {
        String inputKey = "key1";
        String inputValue = "value2";
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            putAll(Map.of("key1", inputKey, "key2", inputValue));
        }});
        String expectedUrl = "http://example.com/path?key1=value2";
        assertEquals(expectedUrl, urlBuilder.build().toString());
    }

}