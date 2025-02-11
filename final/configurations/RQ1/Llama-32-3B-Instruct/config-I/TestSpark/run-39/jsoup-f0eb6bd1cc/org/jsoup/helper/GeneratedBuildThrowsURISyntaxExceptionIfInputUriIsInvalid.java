package org.jsoup.helper;

public class GeneratedBuildThrowsURISyntaxExceptionIfInputUriIsInvalid {

    @Test
    public void buildThrowsURISyntaxExceptionIfInputUriIsInvalid() {
        try {
            URL u = new URL("invalid://example.com?query=abc");
            new UrlBuilder(u);
            assert false;
        } catch (URISyntaxException e) {
            // expected
        }
    }

}