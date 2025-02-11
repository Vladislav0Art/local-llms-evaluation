package org.jsoup.helper;

public class GeneratedBuildThrowsMalformedURLExceptionIfInputIsInvalid {

    @Test
    public void buildThrowsMalformedURLExceptionIfInputIsInvalid() {
        try {
            new UrlBuilder(null);
            assert false;
        } catch (MalformedURLException e) {
            // expected
        }
    }

}