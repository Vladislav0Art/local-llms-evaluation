package org.jsoup.nodes;

public class GeneratedTestParseStringOnMockDocument {

    @Test
    public void testParseStringOnMockDocument() {
        String data = "<comment>data</comment>";
        Document document = mockDoc;
        ParseSettings settings = document.new ParseSettings();
        String result = document.parse(data, settings);
    }

}