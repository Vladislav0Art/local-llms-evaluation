package org.jsoup.helper;

public class GeneratedTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder();
    }

    @Test
    public void build_multipleCalls_sameResult() {
        URL inputUrl = new URL("http://www.example.com");
        urlBuilder.u = inputUrl;

        URL result1 = urlBuilder.build();
        URL result2 = urlBuilder.build();

        assertEquals(result1, result2);
    }

    @Test
    public void appendKeyVal_validInput_correctlyFormatted() throws UnsupportedEncodingException {
        urlBuilder.q = new StringBuilder();

        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(kv);

        assertEquals("key=value", urlBuilder.q.toString());
    }

    @Test
    public void decodePart_encodedInput_correctlyDecoded() {
        String encoded = "test%20string";

        String result = urlBuilder.decodePart(encoded);

        assertEquals("test string", result);
    }

    @Test
    public void appendToAscii_nonAsciiInput_correctlyConverted() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();

        urlBuilder.appendToAscii("test string", true, sb);

        assertEquals("test+string", sb.toString());
    }

}