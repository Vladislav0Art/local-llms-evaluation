package org.jsoup.nodes;

public class GeneratedTestParseStringOnMockDocumentWithSettings {

    @Test
    public void testParseStringOnMockDocumentWithSettings() {
        String data = "<comment>data</comment>";
        Document document = mockDoc;
        ParseSettings settings = mockDoc.new ParseSettings();
        String result = document.parse(data, settings);
    }

}