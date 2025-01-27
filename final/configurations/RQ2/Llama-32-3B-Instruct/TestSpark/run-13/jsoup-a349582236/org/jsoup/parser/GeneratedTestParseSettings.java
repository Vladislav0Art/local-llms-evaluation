package org.jsoup.parser;

public class GeneratedTestParseSettings {

    @Test
    public void testParseSettings() throws Exception {
        ParseSettings settings = new ParseSettings(false, true);
        settings.setHtml("<html><body>Hello World!</body></html>");
        Document document = Jsoup.parse(settings.getHtml());
        System.out.println(document.body().text());
    }
}

public class ParseSettings {
    private boolean selfClosing;
    private String html;

    public ParseSettings(boolean selfClosing, String html) {
        this.selfClosing = selfClosing;
        this.html = html;
    }

    public void setSelfClosing(boolean selfClosing) {
        this.selfClosing = selfClosing;
    }

    public String getHtml() {
        return html;
    }

    public void parse(String html) throws Exception {
        this.html = html;
        Document document = Jsoup.parse(html);
        this.document = document;
    }

}