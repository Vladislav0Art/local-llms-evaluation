package org.jsoup.nodes;

public class GeneratedTestSetContent {

    // ...

    private String content;

    public void setContent(String content) {
        Validate.notNull(content, "content must not be null");
        this.content = content;
    }

    public void setContent(StringBuilder builder, String content) {
        Validate.notNull(builder, "builder must not be null");
        Validate.notNull(content, "content must not be null");
        builder.append(content);
    }
}

public class ContentHandler implements DocumentParserHandler<Document> {
    @Override
    public Document parse(String xml) throws ParserException {
        // implement content handler logic here
        return new Document();
    }

    @Override
    public void handleDocument(Document document, Element root) {
        // implement content handler logic here
    }
}

public class TestContentHandler extends AbstractTestParserHandler<ContentHandler> {
    @Override
    protected ContentHandler getParser() {
        return new ContentHandler();
    }
}

// ...

public class DocumentParserTest {

    @Test
    public void testSetContent() {
        Document document = new Document();
        String content = "Hello World!";
        document.setContent(content);
        assertEquals(content, document.getContent());
    }

}