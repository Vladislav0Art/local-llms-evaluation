package org.jsoup.nodes;

public class GeneratedTestDocument {

    private String text;
    private Charset charset;

    public static Document createDocument(String uri) {
        return new Document(uri);
    }

    public void updateMetaCharsetElement(String element) {
    }

    public boolean setText(String text) {
        this.text = text;
        return true;
    }

    public Charset getCharset() {
        return charset;
    }
}

public class OutputSettings {
    public String charset;

    public void setCharset(String charset) {
        this.charset = charset;
    }
}

public class DocumentTest {

    @Test
    public void testDocument() throws Exception {
        Document document = Document.createDocument("baseURI");
        Assert.assertTrue(document.setText("test text"));
        Assert.assertEquals("UTF-8", (String) document.getCharset());
        Assert.assertTrue(Document.class.isAssignableFrom(document.getClass()));
    }

}