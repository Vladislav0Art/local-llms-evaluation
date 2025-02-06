package org.jsoup.helper;

public class GeneratedFromJsoup_ConvertsJsoupDocumentToW3CDom {

    @Test
    public void fromJsoup_ConvertsJsoupDocumentToW3CDom() {
        // arrange
        Document in = new org.jsoup.nodes.Document();
        Document expected = new org.w3c.dom.Document();

        // act
        Document w3cdom = W3CDom.fromJsoup(in);

        // assert
        assertEquals(expected, w3cdom);
    }

}