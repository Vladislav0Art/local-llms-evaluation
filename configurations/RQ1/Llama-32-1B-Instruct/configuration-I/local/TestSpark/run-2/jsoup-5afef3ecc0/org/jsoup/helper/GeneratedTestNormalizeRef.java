package org.jsoup.helper;

public class GeneratedTestNormalizeRef {

    @Test
    public void testNormalizeRef() {
        String inputRef = "ref=%20";
        String expectedNormalizedRef = "ref=%20";

        String normalizedRef = UrlBuilder.normalizeRef(inputRef);
        assert normalizedRef.equals(expectedNormalizedRef);

        String refEncoded = UrlHelper.URLEncoder.encode(normalizedRef, UTF_8.name());
        String expectedEncoded = "%3A%2F20";
        String expectedDecoded = "ref=%20";
        assert refEncoded.equals(expectedEncoded);
    }

}