package org.jsoup.helper;

public class Generated[MethodUnderTest]

NormalizeQuery {

    @Test
    public void [MethodUnderTest]NormalizeQuery() throws UnsupportedEncodingException {
        // GIVEN
        String query = "%5Bquery%20value%2F";

        // WHEN
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com/path"));
        urlBuilder.normalizeQuery(query);

        // THEN
        assert !query.equals(urlBuilder.query);
    }

}