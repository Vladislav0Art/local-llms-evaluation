package org.jsoup.helper;

public class GeneratedDecodePart_encodedInput_correctlyDecoded {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder();
    }

    @Test
    public void decodePart_encodedInput_correctlyDecoded() {
        String encoded = "test%20string";

        String result = urlBuilder.decodePart(encoded);

        assertEquals("test string", result);
    }

}