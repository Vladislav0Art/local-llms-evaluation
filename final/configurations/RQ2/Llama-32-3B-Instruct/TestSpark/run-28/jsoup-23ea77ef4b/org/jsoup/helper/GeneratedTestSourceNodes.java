package org.jsoup.helper;

public class GeneratedTestSourceNodes {

    @Test
    public void testSourceNodes() {
        NodeList nodeList = new ArrayList<>();
        List<String> result = W3CDom.sourceNodes(nodeList, String.class);
        assertTrue(result instanceof ArrayList);
    }

}