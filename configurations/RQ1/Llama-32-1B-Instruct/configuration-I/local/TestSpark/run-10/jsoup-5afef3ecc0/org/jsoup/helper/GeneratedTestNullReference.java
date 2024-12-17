package org.jsoup.helper;

public class GeneratedTestNullReference {

    @Test
    public void testNullReference() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com#reference"));
        assert null == urlBuilder.q;
    }

}