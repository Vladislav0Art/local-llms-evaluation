package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void newCommentCreatesMockParser() {
        MockDocument mockDoc = new MockDocument();
        MockParser parser = mockDoc.new MockParser();
    }

    @Test
    public void newCommentCreatesMockDocument() {
        MockDocument mockDoc = new MockDocument();
    }

    @Test
    public void testParseSettingsConstructor1Parameter() {
        ParseSettings settings = mockDoc.new ParseSettings(false, false);
    }

    @Test
    public void testParseSettingsConstructor2Parameter() {
        ParseSettings settings = mockDoc.new ParseSettings();
    }

    @Test
    public void testSetXmlDeclarationOnMockSettings() {
        ParseSettings settings = mockDoc.new ParseSettings();
        settings.setXmlDeclaration(true);
    }

    @Test
    public void testParseStringOnMockDocument() {
        String data = "<comment>data</comment>";
        Document document = mockDoc;
        ParseSettings settings = document.new ParseSettings();
        String result = document.parse(data, settings);
    }

    @Test
    public void testGetBodyOnMockDocument() {
        MockDocument mockDoc = new MockDocument();
        Appendable body = mockDoc.body();
    }

    @Test
    public void testSetCommentOnMockDocument() {
        Comment comment = new Comment("");
        mockDoc.setComment(comment);
    }

    @Test
    public void testOutputHtmlTailOnMockDocument() {
        Appendable accum = mockDoc.body();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        MockParser parser = new MockParser();
        parser.outerHtmlTail(accum, depth, out);
    }

    @Test
    public void testOutputHtmlHeadOnMockDocument() {
        Appendable accum = mockDoc.body();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        MockParser parser = new MockParser();
        parser.outerHtmlHead(accum, depth, out);
    }

    @Test
    public void testParseStringOnMockDocumentWithSettings() {
        String data = "<comment>data</comment>";
        Document document = mockDoc;
        ParseSettings settings = mockDoc.new ParseSettings();
        String result = document.parse(data, settings);
    }

    @Test
    public void testGetBodyOnMockDocumentWithSettings() {
        MockDocument mockDoc = new MockDocument();
        Appendable body = mockDoc.body();
        mockDoc.setComment(body);
    }

    @Test
    public void testFirstChildOnMockDocumentWithSettings() {
        MockDocument mockDoc = new MockDocument();
        Document document = mockDoc.new Document();
        comment = document.firstChild();

    }
}

public class MockParser {
    public void outerHtmlTail(Appendable accum, int depth, OutputSettings out) {
    }

    public void outerHtmlHead(Appendable accum, int depth, OutputSettings out) {
    }
}

public class MockDocument {
    private Appendable body;

    public MockDocument() {
        this.body = new StringBuilder();
    }

    public ParseSettings new

    ParseSettings() {
        return new ParseSettings();
    }

    public void setComment(Appendable comment) {
        this.body.append(comment);
    }

    public Document new

    Document() {
        return null;
    }
}

public class Comment {
}

}