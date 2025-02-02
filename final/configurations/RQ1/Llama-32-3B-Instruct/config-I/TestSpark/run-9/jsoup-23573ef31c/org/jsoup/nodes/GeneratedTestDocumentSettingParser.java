package org.jsoup.nodes;

public class GeneratedTestDocumentSettingParser {

    private OutputSettings outputSettings;

    // getters and setters for fields
}

// test class
public class DocumentTest {

    @Before
    public void setUp() {
        this.outputSettings = new OutputSettings();
        this.document = new Document();
        this.parser = new Parser();
        this.connection = new Connection();
    }

    @Test
    public void testDocumentSettingParser() {
        parser.setEncoding("utf-8");
        parser.setDefaultAttributeNS("http://www.w3.org/1999/xhtml", "xml:lang");
        document.parser(parser);
    }

}