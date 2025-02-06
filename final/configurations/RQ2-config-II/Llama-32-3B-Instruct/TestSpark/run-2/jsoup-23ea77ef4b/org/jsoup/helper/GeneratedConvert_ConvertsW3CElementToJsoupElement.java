package org.jsoup.helper;

public class GeneratedConvert_ConvertsW3CElementToJsoupElement {

    @Test
    public void convert_ConvertsW3CElementToJsoupElement() {
        // arrange
        org.w3c.dom.Element in = new org.w3c.dom.Element();
        org.jsoup.nodes.Element expected = new org.jsoup.nodes.Element();

        // act
        org.jsoup.nodes.Element result = W3CDom.convert(expected);

        // assert
        assertEquals(in, result);
    }

}