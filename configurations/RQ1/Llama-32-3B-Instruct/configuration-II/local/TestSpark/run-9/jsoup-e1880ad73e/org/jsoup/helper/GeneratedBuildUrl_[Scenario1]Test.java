package org.jsoup.helper;

public class GeneratedBuildUrl_[Scenario1]

Test {

    @Test
    public void buildUrl_[ Scenario1]Test() {
        URL u = new URL("http://example.com/path/to/resource");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals(new URL("http://example.com/path%2Fto%2Fresource"), builder.build());
    }

}