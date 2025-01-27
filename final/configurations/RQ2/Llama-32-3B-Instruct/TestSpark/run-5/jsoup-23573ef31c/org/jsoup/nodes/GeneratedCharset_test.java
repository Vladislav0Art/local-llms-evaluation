package org.jsoup.nodes;

public class GeneratedCharset_test {

    @Test
    public void charset_test() {
        Document document = new Document("http://example.com");
        Charset charset = Charset.forName("UTF-8");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

}