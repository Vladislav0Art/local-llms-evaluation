package org.jsoup.helper;

public class GeneratedBuild_null {

    @Test
    public void build_null() {
        try {
            new UrlBuilder(null);
            assert false;
        } catch (NullPointerException e) {
            assert true;
        }
    }

}