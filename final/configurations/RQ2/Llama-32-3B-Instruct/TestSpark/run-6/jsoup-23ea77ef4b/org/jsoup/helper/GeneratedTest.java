package org.jsoup.helper;

public class GeneratedTest {

    public static NodeList sourceNodes(NodeList childNodes, Class<?> clazz) {
        NodeList list = new NodeList();
        for (org.jsoup.nodes.Node node : childNodes) {
            if (clazz.isInstance(node)) {
                list.add(node);
            }
        }
        return list;
    }

    public static class NodeList extends org.jsoup.nodes.NodeList {
        @Override
        public void add(org.jsoup.nodes.Node node) {
        }
    }
}

public class JsoupTest {

    @Test
    public void testJsoup() {
        // Create a new document
        Document doc = Jsoup.parse("<html><body>Hello, World!</body></html>");

        // Print the title of the HTML document
        System.out.println(doc.title());

        // Print the content of all tags with class "test"
        for (Element element : doc.getElementsByClass("test")) {
            System.out.println(element.text());
        }

        // Create a new paragraph
        Element paragraph = doc.createElement("p").text("This is a new paragraph.");

        // Append the paragraph to the body
        Element body = doc.body();
        if (body != null) {
            body.appendChild(paragraph);
        }

        // Print the source nodes of all elements in the document
        NodeList nodeList = W3CDom.sourceNodes(doc.childNodes(), org.jsoup.nodes.Node.class);
        for (org.jsoup.nodes.Node node : nodeList) {
            System.out.println(node.toString());
        }
    }

}