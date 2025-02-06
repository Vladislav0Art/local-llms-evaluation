package org.jsoup.helper;

public class GeneratedConvertDocumentTest {

    private static final Document DOC = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

    @Test
    public void convertDocumentTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        Document expectedDoc = DOC;
        assertEquals(expectedDoc, W3CDom.convert(doc));
    }

}