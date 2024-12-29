package org.jsoup.helper;

public class GeneratedTestOutputHtml {

    @Test
    public void testOutputHtml() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        W3CDom instance = new W3CDom();
        Map<String, String> properties = new HashMap<>();
        instance.OutputHtml(properties);
        assert PropertiesUtils.equals(document.getPropertyValue("xmlns"), "http://www.w3.org/1999/xhtml");
    }

}