package org.jsoup.helper;

public class GeneratedTestNullQuery {

    @Test
    public void TestNullQuery() {
        URL nullQueryUrl = new URL("http://example.com");
        String expectedQuery = null;
        String actualQuery = UrlBuilder.build().getQuery().toString();
        assert !actualQuery.equals(expectedQuery);
    }

}