package org.jsoup.helper;

public class GeneratedTestOutputXml {

    @Test
    public void testOutputXml() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        W3CDom instance = new W3CDom();
        Map<String, String> properties = new HashMap<>();
        instance.OutputXml(properties);
        assert PropertiesUtils.equals(document getPropertyValue("xmlns"), "http://www.w3.org/1999/xhtml");
    }

}