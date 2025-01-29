package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_URIEncoding {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        // TO DO: add necessary setup for test cases
    }

    @Test
    public void testAppendKeyVal_URIEncoding() throws UnsupportedEncodingException {
        String inputKey = "key1=value1";
        String inputValue = "value2";
        URL encodedInput = URLEncoder.encode(inputKey, "UTF-8");
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("key1", encodedInput);
            put("key2", inputValue);
        }});
        String expectedUrl = "http://example.com/path?key1=value1&key2=value2";
        assertEquals(expectedUrl, urlBuilder.build().toString());
    }

}