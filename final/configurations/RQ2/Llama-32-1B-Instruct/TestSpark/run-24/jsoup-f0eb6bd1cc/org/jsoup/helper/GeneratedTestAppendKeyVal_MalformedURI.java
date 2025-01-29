package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_MalformedURI {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        // TO DO: add necessary setup for test cases
    }

    @Test
    public void testAppendKeyVal_MalformedURI() throws UnsupportedEncodingException {
        String inputKey = "key1=value1";
        String inputValue = "value2";
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            putAll(Map.of("key1", inputKey, "key2", inputValue));
        }});
        try {
            String expectedUrl = "http://example.com/path?key1%20value1";
            assertEquals(expectedUrl, urlBuilder.build().toString());
        } catch (UnsupportedEncodingException e) {
            // TO DO: verify error handling for malformed URI
        }
    }

}