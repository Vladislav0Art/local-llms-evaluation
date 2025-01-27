package org.jsoup.helper;

public class GeneratedTestURLConstruction {

    @Test
    public void testURLConstruction() {
        String encodedValue = "param=value";
        try {
            new URL("http://example.com/path?param=" + encodedValue);
            assert false : "Expected exception not thrown";
        } catch (MalformedURLException e) {
            // expected
        }
    }

}