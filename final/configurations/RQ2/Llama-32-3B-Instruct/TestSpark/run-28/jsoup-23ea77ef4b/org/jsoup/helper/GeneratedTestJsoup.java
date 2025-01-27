package org.jsoup.helper;

public class GeneratedTestJsoup {

    @Test
    public void testJsoup() {
        String html = "<html><body><h1>Hello, World!</h1></body></html>";
        Document doc = org.jsoup.Jsoup.parse(html);
        System.out.println(doc.html());
    }

    public static class W3CDom {

        public static List<String> sourceNodes(NodeList nodeList, Class<?> type) {
            // implementation
            return null;
        }

        public static Document contextNode(Document wDoc) {
            // implementation
            return null;
        }
    }

    public class Node {
    }

}