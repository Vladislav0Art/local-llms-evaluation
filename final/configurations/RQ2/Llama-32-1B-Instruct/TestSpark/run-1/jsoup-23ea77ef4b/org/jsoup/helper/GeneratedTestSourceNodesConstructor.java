package org.jsoup.helper;

public class GeneratedTestSourceNodesConstructor {

    @Test
    public void testSourceNodesConstructor() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        W3CDom instance = new W3CDom();
        List<Node> sourceNodesList = new ArrayList<>();
        instance.sourceNodes(null, sourceNodesList);
        assert sourceNodesList.contains(document.body());
    }

}