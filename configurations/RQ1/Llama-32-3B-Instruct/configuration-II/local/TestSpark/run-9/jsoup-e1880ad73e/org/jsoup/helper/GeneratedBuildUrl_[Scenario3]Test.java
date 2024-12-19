package org.jsoup.helper;

public class GeneratedBuildUrl_[Scenario3]

Test {

    @Test
    public void buildUrl_[ Scenario3]Test() {
        URL u = new URL("http://example.com/path/to/resource#fragment");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals(new URL("http://example.com/path%2Fto%2Fresource"), builder.build());
    }

}