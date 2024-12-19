package org.jsoup.helper;

public class GeneratedBuildNormalUrlTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        this.urlBuilder = new UrlBuilder(new URL("http://example.com/path?query=value#ref"));
    }

    @Test
    public void buildNormalUrlTest() throws Exception {
        String expected = "http://example.com/path?query=value#ref";
        assertEquals(expected, urlBuilder.build().toString());
    }

}