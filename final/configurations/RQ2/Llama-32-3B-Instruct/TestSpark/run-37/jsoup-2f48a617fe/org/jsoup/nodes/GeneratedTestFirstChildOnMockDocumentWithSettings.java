package org.jsoup.nodes;

public class GeneratedTestFirstChildOnMockDocumentWithSettings {

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