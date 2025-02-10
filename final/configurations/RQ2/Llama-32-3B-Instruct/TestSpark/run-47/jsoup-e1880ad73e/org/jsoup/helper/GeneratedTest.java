package org.jsoup.helper;

public class GeneratedTest {

    private String url;

    public UrlBuilder(String url) {
        this.url = url;
    }
}

public class DataUtil {
    public static final String UTF_8 = "UTF-8";
}

public class TestUrlBuilder {

    @Test
    public void urlBuilderConstructorsTest() {
        assertTrue(UrlBuilder.class.isInstance(new UrlBuilder(null)));
    }

    @Test
    public void buildUrlReturnsNullWhenInputIsNull() {
        assertNull(new UrlBuilder(null).build());
    }

}