package org.jsoup.helper;

public class Generated[MethodUnderTest]

AppendKeyVal {

    @Test
    public void [MethodUnderTest]AppendKeyVal() throws UnsupportedEncodingException {
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

}