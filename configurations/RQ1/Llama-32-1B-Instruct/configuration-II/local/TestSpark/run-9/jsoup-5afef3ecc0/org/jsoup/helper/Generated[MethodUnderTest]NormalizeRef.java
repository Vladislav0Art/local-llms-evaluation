package org.jsoup.helper;

public class Generated[MethodUnderTest]

NormalizeRef {

    @Test
    public void [MethodUnderTest]NormalizeRef() throws UnsupportedEncodingException {
        // GIVEN
        String reference = "%20fragment";

        // WHEN
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com/path"));
        urlBuilder.normalizeRef(reference);

        // THEN
        assert !reference.equals(urlBuilder.ref);
    }

}