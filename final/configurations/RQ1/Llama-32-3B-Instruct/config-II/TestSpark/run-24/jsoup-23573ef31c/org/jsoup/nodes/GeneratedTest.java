package org.jsoup.nodes;

public class GeneratedTest {

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

    @Test
    public void testsetContentBuilder() {
        StringBuilder builder = new StringBuilder();
        Document document = new Document();
        document.setContent(builder, "Hello World!");
        assertTrue(builder.toString().equals("Hello World!"));
    }
}

public class ContentHandlerTest extends AbstractDocumentParserHandlerTest<ContentHandler> {
    @Override
    protected ContentHandler getParser() {
        return new ContentHandler();
    }

    @Test
    public void testParse() throws ParserException {
        String xml = "<root><content>Hello World!</content></root>";
        Document document = this.parser().parse(xml);
        assertNotNull(document);
        assertEquals(1, document.getContentSize());
        assertEquals("Hello World!", document.getContent());
    }
}

public class TestContentHandlerTest extends AbstractTestParserHandlerTest<ContentHandler> {
    @Override
    protected ContentHandler getParser() {
        return new ContentHandler();
    }

    @Test
    public void testHandleDocument() throws ParserException {
        Document document = this.parser().parse("<root><content>Hello World!</content></root>");
        Element root = new Element("root");
        root.appendChild(new Element("content", "Hello World!"));
        this.parser().handleDocument(document, root);
        assertNotNull(root.getContents());
    }

}