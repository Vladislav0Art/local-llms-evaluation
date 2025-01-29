package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_NoValues {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        // TO DO: add necessary setup for test cases
    }

    @Test
    public void testAppendKeyVal_NoValues() throws UnsupportedEncodingException {
        String inputKey = "key1";
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("key1", inputKey);
        }});
        String expectedUrl = "http://example.com/path?key1";
        assertEquals(expectedUrl, urlBuilder.build().toString());
    }

}