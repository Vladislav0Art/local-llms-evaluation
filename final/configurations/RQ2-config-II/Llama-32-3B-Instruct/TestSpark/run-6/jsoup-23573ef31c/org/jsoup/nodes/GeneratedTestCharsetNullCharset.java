package org.jsoup.nodes;

public class GeneratedTestCharsetNullCharset {

    @Test
    public void testCharsetNullCharset() {
        Charset charset = null;
        Document document = new Document("");
        try {
            document.charset(charset);
            assert false;
        } catch (NullPointerException e) {
            // expected
        }
    }

}