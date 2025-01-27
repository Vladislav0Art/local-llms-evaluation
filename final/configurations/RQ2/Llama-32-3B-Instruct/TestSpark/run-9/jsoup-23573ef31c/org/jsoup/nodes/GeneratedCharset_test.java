package org.jsoup.nodes;

public class GeneratedCharset_test {

    @Test
    public void charset_test() {
        Charset charset = Charset.forName("UTF-8");
        Document document = new Document("http://example.com");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

}