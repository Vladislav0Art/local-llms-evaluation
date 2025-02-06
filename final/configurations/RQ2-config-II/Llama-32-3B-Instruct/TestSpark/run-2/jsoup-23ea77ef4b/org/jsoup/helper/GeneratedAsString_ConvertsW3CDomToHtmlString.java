package org.jsoup.helper;

public class GeneratedAsString_ConvertsW3CDomToHtmlString {

    @Test
    public void asString_ConvertsW3CDomToHtmlString() {
        // arrange
        Document doc = new org.w3c.dom.Document();
        Map<String, String> properties = new HashMap<>();

        // act
        String result = W3CDom.asString(doc, properties);

        // assert
        assertNotNull(result);
    }

}