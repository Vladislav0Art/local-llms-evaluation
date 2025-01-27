package org.jsoup.nodes;

public class GeneratedCharset_SetCharset {

    @Test
    public void charset_SetCharset() {
        String html = "<html><body>Document</body></html>";
        Document document = new Document(html);
        document.charset("New Charset");
        assertEquals("New Charset", document.charset());
    }

}