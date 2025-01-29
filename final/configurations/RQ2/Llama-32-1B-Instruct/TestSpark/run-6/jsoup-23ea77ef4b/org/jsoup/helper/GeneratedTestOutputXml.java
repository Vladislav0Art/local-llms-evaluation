package org.jsoup.helper;

public class GeneratedTestOutputXml {

    @Test
    public void testOutputXml() {
        StringWriter writer = new StringWriter();
        Document doc = new org.jsoup.nodes.DocumentBuilder().build(neworg.jsoup.nodes.Document("<html><body>test</body></html>"));
        W3CDom.W3CDom.fromJsoup(doc);
        String xml = writer.toString();
        Assert.assertTrue(xml.contains("http://example.com") && xml.contains("/namespace"));
    }

}