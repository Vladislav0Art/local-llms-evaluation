package org.jsoup.nodes;

public class GeneratedTestJsoup {

    private String url;

    public Tests(String url) {
        super(url);
        this.url = url;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testJsoup() throws Exception {
        Document document = Jsoup.connect(url).get();
        Element[] nodes = {document.select("body").first(), document.select("html").first()};
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document.OutputSettings settings = Document.OutputSettings.builder().build();
        document.output(settings, out);
        assertTrue(out.toString().contains("text1"));
        assertTrue(out.toString().contains("text2"));
    }
}

public class MockTextNode extends TextNode {
    private String text;

    @Override
    public MockTextNode(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}