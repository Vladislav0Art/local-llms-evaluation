package org.jsoup.helper;

public class GeneratedTestSourceNodes {

    @Test
    public void testSourceNodes() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        List<Node> sourceNodesList = new ArrayList<>();
        W3CDom.instance.sourceNodes(null, sourceNodesList);
        assert sourceNodesList.contains(document.body());
    }

}