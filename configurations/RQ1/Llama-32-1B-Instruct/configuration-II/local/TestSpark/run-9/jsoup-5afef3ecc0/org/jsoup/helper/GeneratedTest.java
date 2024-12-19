package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void [MethodUnderTest]

    UrlBuilder() {
        // GIVEN
        String inputUrl = "https://example.com/path?query=value#fragment";

        // WHEN
        URLBuilder urlBuilder = new UrlBuilder(new URI(inputUrl));
        try {
            urlBuilder.build();
        } catch (MalformedURLException e) {
            assert false;
        }
    }

    @Test
    public void [MethodUnderTest]

    AppendKeyVal() throws UnsupportedEncodingException {
        // GIVEN
        String inputQuery = "key=value";
        String inputReference = "#fragment";

        // WHEN
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com/path"));
        urlBuilder.appendKeyVal(new Connection.KeyVal(inputQuery, inputReference));
        try {
            urlBuilder.build();
        } catch (MalformedURLException e) {
            assert false;
        }
    }

    @Test
    public void [MethodUnderTest]

    NormalizeQuery() throws UnsupportedEncodingException {
        // GIVEN
        String query = "%5Bquery%20value%2F";

        // WHEN
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com/path"));
        urlBuilder.normalizeQuery(query);

        // THEN
        assert !query.equals(urlBuilder.query);
    }

    @Test
    public void [MethodUnderTest]

    NormalizeRef() throws UnsupportedEncodingException {
        // GIVEN
        String reference = "%20fragment";

        // WHEN
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com/path"));
        urlBuilder.normalizeRef(reference);

        // THEN
        assert !reference.equals(urlBuilder.ref);
    }

}