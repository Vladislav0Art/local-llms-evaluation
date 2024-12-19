package org.jsoup.helper;

public class GeneratedNormalizeQueryTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        this.urlBuilder = new UrlBuilder(new URL("http://example.com/path?query=value#ref"));
    }

    @Test
    public void normalizeQueryTest() throws Exception {
        String expected = "path?query%3Dvalue";
        assertEquals(expected, UrlBuilder.normalizeQuery("path ? query=value"));
    }

}