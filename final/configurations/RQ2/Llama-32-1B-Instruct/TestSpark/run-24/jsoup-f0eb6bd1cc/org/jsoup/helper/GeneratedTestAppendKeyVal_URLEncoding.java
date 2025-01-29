package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_URLEncoding {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        // TO DO: add necessary setup for test cases
    }

    @Test
    public void testAppendKeyVal_URLEncoding() throws UnsupportedEncodingException {
        String inputKey = "key1=value1";
        String inputValue = "value2";
        URL encodedInput = URLEncoder.encode(inputValue, "UTF-8");
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("key1", inputKey);
            putAll(Map.of("key2", encodedInput));
        }});
        String expectedUrl = "http://example.com/path?key1=value1&key2%20value2";
        assertEquals(expectedUrl, urlBuilder.build().toString());
    }

}