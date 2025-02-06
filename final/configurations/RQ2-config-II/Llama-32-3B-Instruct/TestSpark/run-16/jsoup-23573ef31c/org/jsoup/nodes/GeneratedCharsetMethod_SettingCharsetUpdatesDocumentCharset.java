package org.jsoup.nodes;

public class GeneratedCharsetMethod_SettingCharsetUpdatesDocumentCharset {

    @Test
    public void charsetMethod_SettingCharsetUpdatesDocumentCharset() {
        Charset charset = Charset.forName("UTF-8");
        Document doc = Document.createShell("");
        doc.charset(charset);
        assertEquals(charset, doc.charset());
    }

}