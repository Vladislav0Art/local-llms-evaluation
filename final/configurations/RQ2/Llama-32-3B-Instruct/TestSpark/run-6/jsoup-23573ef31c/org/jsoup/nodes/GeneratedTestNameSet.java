package org.jsoup.nodes;

public class GeneratedTestNameSet {

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
    public void testNameSet() {
        String html = "<html><body><p name=\"test\">Hello</p></body></html>";
        HtmlParser parser = new HtmlParser(html);
        parser.setName("newName");
        assertTrue(parser.getName().equals("newName"));
    }

}