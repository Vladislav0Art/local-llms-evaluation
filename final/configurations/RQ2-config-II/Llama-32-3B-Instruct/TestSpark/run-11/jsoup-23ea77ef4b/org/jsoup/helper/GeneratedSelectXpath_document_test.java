package org.jsoup.helper;

public class GeneratedSelectXpath_document_test {

    @Test
    public void selectXpath_document_test() throws Exception {
        Document doc = createDocument();
        String xpath = "/html/body";
        NodeList result = W3CDom.selectXpath(xpath, doc);
        assertNotNull(result);
        assertEquals(2, result.getLength());
    }

}