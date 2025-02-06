package org.jsoup.nodes;

public class GeneratedTestCharsetValidCharset {

    @Test
    public void testCharsetValidCharset() {
        Charset charset = "UTF-8";
        Document document = new Document("");
        document.charset(charset);
        assertNotNull(document.charset());
    }

}