package org.jsoup.helper;

public class Generated[UrlBuilderConstructor][InputInvalidURL]

Test {

    @Test
    public void [UrlBuilderConstructor][InputInvalidURL]Test() {
        URL url = null;
        try {
            new UrlBuilder(url);
            fail("Expected exception was not thrown");
        } catch (NullPointerException e) {
            // expected
        }
    }

}