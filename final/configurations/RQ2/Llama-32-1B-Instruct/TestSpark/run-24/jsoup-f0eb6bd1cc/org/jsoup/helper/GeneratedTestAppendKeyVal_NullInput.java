package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_NullInput {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        // TO DO: add necessary setup for test cases
    }

    @Test
    public void testAppendKeyVal_NullInput() {
        try {
            urlBuilder.appendKeyVal(null);
        } catch (NullPointerException e) {
            // TO DO: verify error handling for null input
        }
    }

}