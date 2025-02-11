package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void ofEmptyUrlShouldReturnNull() {
        UrlBuilder builder = new UrlBuilder(null);
        assert builder.u == null;
        assert builder.q == null;
    }

}