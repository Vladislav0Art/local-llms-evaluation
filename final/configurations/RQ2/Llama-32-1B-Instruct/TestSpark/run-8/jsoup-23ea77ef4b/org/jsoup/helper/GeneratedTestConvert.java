package org.jsoup.helper;

public class GeneratedTestConvert {

    @Test
    public void testConvert() throws Exception {
        String doc = "<doc><body>Hello World!</body></doc>";
        Document convertedDoc = W3CDomHelper.convert(new org.jsoup.nodes.Document(doc));
        assertEquals("<doc><body>Hello World!</body></doc>", convertedDoc.toString());
    }

}