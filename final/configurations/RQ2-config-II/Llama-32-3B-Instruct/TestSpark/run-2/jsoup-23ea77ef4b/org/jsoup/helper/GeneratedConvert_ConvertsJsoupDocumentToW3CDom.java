package org.jsoup.helper;

public class GeneratedConvert_ConvertsJsoupDocumentToW3CDom {

    @Test
    public void convert_ConvertsJsoupDocumentToW3CDom() {
        // arrange
        Document in = new org.w3c.dom.Document();
        Document expected = new org.w3c.dom.Document();

        // act
        Document w3cdom = W3CDom.convert(in);

        // assert
        assertEquals(expected, w3cdom);
    }

}