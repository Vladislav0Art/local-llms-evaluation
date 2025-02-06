package org.jsoup.helper;

public class GeneratedConvert_document_test {

    @Test
    public void convert_document_test() throws Exception {
        Document doc = createDocument();
        W3CDom.convert(doc, doc);
        assertEquals(doc, W3CDom.convert(doc));
    }

}