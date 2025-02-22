package org.jsoup.helper;

public class GeneratedAppendToAscii_nonAsciiInput_correctlyConverted {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder();
    }

    @Test
    public void appendToAscii_nonAsciiInput_correctlyConverted() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();

        urlBuilder.appendToAscii("test string", true, sb);

        assertEquals("test+string", sb.toString());
    }

}