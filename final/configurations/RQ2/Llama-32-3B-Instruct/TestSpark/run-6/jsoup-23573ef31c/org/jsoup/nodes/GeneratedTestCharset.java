package org.jsoup.nodes;

public class GeneratedTestCharset {

    private String name;
    private String charset;

    public HtmlParser(String html) {
        // parser initialization
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getName() {
        return name;
    }

    public String getCharset() {
        return charset;
    }
}

public class HtmlParserTest {

    @Test
    public void testCharset() {
        String html = "<html><body><script charset=\"UTF-8\"></script></body></html>";
        HtmlParser parser = new HtmlParser(html);
        assertEquals("UTF-8", parser.getCharset());
    }

}