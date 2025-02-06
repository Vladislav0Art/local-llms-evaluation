package org.jsoup.helper;

public class GeneratedFromJsoup_ConvertsJsoupElementToW3CElement {

    @Test
    public void fromJsoup_ConvertsJsoupElementToW3CElement() {
        // arrange
        org.jsoup.nodes.Element in = new org.jsoup.nodes.Element();
        Document expected = new org.w3c.dom.Document();

        // act
        Document w3cdom = W3CDom.fromJsoup(in);

        // assert
        assertEquals(expected, w3cdom);
    }

}