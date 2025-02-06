package org.jsoup.helper;

public class GeneratedAsString_document_with_properties_test {

    @Test
    public void asString_document_with_properties_test() throws Exception {
        Document doc = createDocument();
        String properties = "{xml:space=\"preserve\"}";
        String result = W3CDom.asString(doc, PropertiesFromMap.create(propertiesToMap(properties)));
        assertEquals("<html xmlns=\"http://www.w3.org/1999/xhtml\"><body>Test</body></html>", result);
    }

}