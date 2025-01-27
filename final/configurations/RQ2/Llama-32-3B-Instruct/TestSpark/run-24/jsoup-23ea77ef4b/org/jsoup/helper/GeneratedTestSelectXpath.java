package org.jsoup.helper;

public class GeneratedTestSelectXpath {

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

    @Test
    public void testSelectXpath() {
        List<String> xpaths = Arrays.asList("/node[@id='1']", "/node[@id='2']");
        String contextNode = "1";
        selectXpath(xpaths, contextNode);
    }

}