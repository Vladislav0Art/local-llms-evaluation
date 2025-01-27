package org.jsoup.helper;

public class GeneratedUrlBuilder_Ctor_NoParameters_ReturnsSelf {

    @Test
    public void urlBuilder_Ctor_NoParameters_ReturnsSelf() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertSame(urlBuilder, urlBuilder.build());
    }

}