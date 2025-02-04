package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationReturnsNullForInvalidCommentData {

    private static final String DATA = "test data";
    private static final ParseSettings parseSettings = new ParseSettings();
    private Document doc;
    private LeafNode parentNode;

    @Before
    public void setup() throws IOException {
        this.doc = Parser.htmlParser().settings(parseSettings).parseInput(DATA, null);
        this.parentNode = (LeafNode) doc.body().parent(0);
    }

    @Test
    public void asXmlDeclarationReturnsNullForInvalidCommentData() throws IOException {
        // mock Appendable
        appendable = Mockito.mock(Appendable.class);
        // mock Document.OutputSettings
        documentSettings = new Document.OutputSettings();
        // mock XmlDeclaration
        xmlDeclaration = Mockito.mock(XmlDeclaration.class);

        Comment comment = new Comment(DATA.substring(1, DATA.length() - 1));
        Comment resultComment = comment.asXmlDeclaration();
        assertNull(resultComment);
    }

}