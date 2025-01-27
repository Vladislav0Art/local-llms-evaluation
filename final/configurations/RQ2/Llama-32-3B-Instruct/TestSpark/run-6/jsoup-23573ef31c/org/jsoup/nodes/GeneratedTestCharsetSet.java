package org.jsoup.nodes;

public class GeneratedTestCharsetSet {

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
    public void testCharsetSet() {
        String html = "<html><body><script charset=\"UTF-8\"></script></body></html>";
        HtmlParser parser = new HtmlParser(html);
        parser.setCharset("newCharset");
        assertEquals("newCharset", parser.getCharset());
    }

}