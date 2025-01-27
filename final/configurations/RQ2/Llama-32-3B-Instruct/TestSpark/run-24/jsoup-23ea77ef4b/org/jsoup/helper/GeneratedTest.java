package org.jsoup.helper;

public class GeneratedTest {

    public static Document convertToDocument(String content) {
        Node node = new Node();
        node.setId("1");
        Document document = new Document();
        document.setContent(content);
        return document;
    }

    public static void selectXpath(List<String> xpaths, String contextNode) {
        for (String xpath : xpaths) {
            if (xpath.contains(contextNode)) {
                System.out.println(xpath);
            }
        }
    }

}