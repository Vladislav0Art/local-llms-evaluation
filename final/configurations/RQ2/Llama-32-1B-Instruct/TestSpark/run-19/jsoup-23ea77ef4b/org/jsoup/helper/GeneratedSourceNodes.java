package org.jsoup.helper;

public class GeneratedSourceNodes {

    @Test
    public void sourceNodes() {
        org.jsoup.nodes.Document doc = new org.jsoup.nodes.Document();
        List<String> nodes = W3CDom.sourceNodes(doc nodeList, String.class);
        Assert.assertEquals(2, nodes.size());
        assertEquals("test", nodes.get(0));
        assertEquals("test2", nodes.get(1));
    }

}