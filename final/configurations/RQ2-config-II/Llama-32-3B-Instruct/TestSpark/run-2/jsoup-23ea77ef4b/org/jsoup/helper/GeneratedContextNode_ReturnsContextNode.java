package org.jsoup.helper;

public class GeneratedContextNode_ReturnsContextNode {

    @Test
    public void contextNode_ReturnsContextNode() {
        // arrange
        Document wDoc = new org.w3c.dom.Document();

        // act
        Node result = W3CDom.contextNode(wDoc);

        // assert
        assertNotNull(result);
    }

}