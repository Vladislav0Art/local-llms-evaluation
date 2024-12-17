package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() {
        String inputKey = "key";
        String inputValue = "value";
        UrlBuilder builder = new UrlBuilder(new URI("https://example.com/path"));
        builder.appendKeyVal(UrlHelper.KeyVal.of(inputKey, inputValue));
        URL normalizedUrl = builder.build();

        // Assert
        assert normalizedUrl.toString().startsWith("https://example.com/path?key=value");
    }

}