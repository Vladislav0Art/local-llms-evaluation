package org.jsoup.helper;

public class GeneratedNormalizeRefTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        this.urlBuilder = new UrlBuilder(new URL("http://example.com/path?query=value#ref"));
    }

    @Test
    public void normalizeRefTest() throws Exception {
        String expected = "ref=%20";
        assertEquals(expected, UrlBuilder.normalizeRef("ref "));
    }

}