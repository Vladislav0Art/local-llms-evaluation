package org.jsoup.nodes;

public class GeneratedParserMethod_SettingParserUpdatesDocumentSettings {

    @Test
    public void parserMethod_SettingParserUpdatesDocumentSettings() {
        Parser parser = new Parser();
        Document doc = Document.createShell("");
        Document result = doc.parser(parser);
        assertNotNull(result);
        assertEquals(parser, result.parser());
    }

}