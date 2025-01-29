package org.jsoup.helper;

public class GeneratedTestOutputHtml {

    @Test
    public void testOutputHtml() {
        StringWriter writer = new StringWriter();
        Document doc = new org.jsoup.nodes.DocumentBuilder().build(neworg.jsoup.nodes.Document("<html><body>test</body></html>"));
        W3CDom.W3CDom.fromJsoup(doc);
        String html = writer.toString();
        Assert.assertTrue(html.contains("http://example.com"));
    }

}