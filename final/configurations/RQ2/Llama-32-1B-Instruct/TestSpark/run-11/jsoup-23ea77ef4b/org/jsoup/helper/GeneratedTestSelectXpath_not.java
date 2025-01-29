package org.jsoup.helper;

public class GeneratedTestSelectXpath_not {

    @Test
    public void testSelectXpath_not() {
        Document document = W3CDom.createDocument();
        NodeList nodeList = W3CDom.selectXpath("name[1]", document);
        assertTrue(nodeList.getLength() == 0);
    }

}