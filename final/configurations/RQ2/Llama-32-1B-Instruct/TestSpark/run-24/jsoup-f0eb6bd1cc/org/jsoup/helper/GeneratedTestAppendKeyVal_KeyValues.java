package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_KeyValues {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        // TO DO: add necessary setup for test cases
    }

    @Test
    public void testAppendKeyVal_KeyValues() throws UnsupportedEncodingException {
        String inputKey = "key1=value1";
        String inputValue = "value2";
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("key1", inputKey);
            put("key2", inputValue);
        }});
        String expectedUrl = "http://example.com/path?key1=value1&key2=value2";
        assertEquals(expectedUrl, urlBuilder.build().toString());
    }

}