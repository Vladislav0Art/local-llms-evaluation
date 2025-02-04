package org.jsoup.nodes;

public class GeneratedAsXmlDeclarationReturnsNullIfFollowingAnotherElement {

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
    public void asXmlDeclarationReturnsNullIfFollowingAnotherElement() throws IOException {
        // mock Appendable
        appendable = Mockito.mock(Appendable.class);
        // mock Document.OutputSettings
        documentSettings = new Document.OutputSettings();

        Comment comment = new Comment(DATA);
        Comment resultComment = comment.asXmlDeclaration();
        assertNull(resultComment);
    }

    private Appendable appendable;
    private Document.OutputSettings documentSettings;
    private XmlDeclaration xmlDeclaration;

    public static class LeafNode {
        // no-op implementation
    }

}