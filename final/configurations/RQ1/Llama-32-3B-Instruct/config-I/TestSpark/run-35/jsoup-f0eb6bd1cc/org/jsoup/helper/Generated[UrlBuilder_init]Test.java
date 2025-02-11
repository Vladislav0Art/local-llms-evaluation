package org.jsoup.helper;

public class Generated[UrlBuilder_init]

Test {

    @Test
    public void [UrlBuilder_init]Test() {
        URL u = new URL("http://example.com");
        UrlBuilder ub = new UrlBuilder(u);
        assert ub.u.equals(u) : "initialization failed";
    }

}