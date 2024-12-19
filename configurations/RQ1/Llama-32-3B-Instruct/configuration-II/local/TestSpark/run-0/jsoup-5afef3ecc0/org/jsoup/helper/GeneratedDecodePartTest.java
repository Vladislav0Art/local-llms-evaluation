package org.jsoup.helper;

public class GeneratedDecodePartTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        this.urlBuilder = new UrlBuilder(new URL("http://example.com/path?query=value#ref"));
    }

    @Test
    public void decodePartTest() throws Exception {
        String encoded = "%C4%80example.com";
        assertEquals("äexample.com", UrlBuilder.decodePart(encoded));
    }

}