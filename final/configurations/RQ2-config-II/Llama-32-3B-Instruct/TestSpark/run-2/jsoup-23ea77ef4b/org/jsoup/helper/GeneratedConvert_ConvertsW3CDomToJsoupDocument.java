package org.jsoup.helper;

public class GeneratedConvert_ConvertsW3CDomToJsoupDocument {

    @Test
    public void convert_ConvertsW3CDomToJsoupDocument() {
        // arrange
        Document in = new org.w3c.dom.Document();
        Document expected = new org.jsoup.nodes.Document();

        // act
        Document result = W3CDom.convert(expected);

        // assert
        assertEquals(in, result);
    }

}