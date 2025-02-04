package org.jsoup.nodes;

public class GeneratedTest {

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
    public void createCommentWithValidDataCreatesCommentWithCorrectData() {
        Comment comment = new Comment(DATA);
        assertEquals(DATA, comment.getData());
    }

    @Test
    public void setCommentsDataSetsCommentDataProperly() {
        Comment comment = new Comment(DATA);
        comment.setData(DATA);
        assertEquals(DATA, comment.getData());
    }

    @Test
    public void outerHtmlHeadIsCalledWhenPrettyPrintAndBlockIsEnabled() throws IOException {
        // mock Appendable
        appendable = Mockito.mock(Appendable.class);
        // mock Document.OutputSettings
        documentSettings = new Document.OutputSettings();
        documentSettings.prettyPrint(true);
        documentSettings.outline(true);

        Comment comment = new Comment(DATA);
        comment.outerHtmlHead(appendable, 0, documentSettings);
        verify(appendable).append("<!--").append(comment.getData()).append("-->");
    }

    @Test
    public void outerHtmlTailIsNotCalled() throws IOException {
        // mock Appendable
        appendable = Mockito.mock(Appendable.class);
        // mock Document.OutputSettings
        documentSettings = new Document.OutputSettings();
        documentSettings.outline(true);

        Comment comment = new Comment(DATA);
        comment.outerHtmlHead(appendable, 0, documentSettings);
        verifyNoMoreInteractions(appendable);
    }

    @Test
    public void outerHtmlReturnsStringRepresentationOfComment() {
        Comment comment = new Comment(DATA);
        String expectedOutput = "<!--" + DATA + "-->";
        assertEquals(expectedOutput, comment.outerHtml());
    }

    @Test
    public void cloneCreatesNewInstanceWithSameData() {
        Comment comment = new Comment(DATA);
        Comment clonedComment = comment.clone();
        assertEquals(comment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclarationReturnsFalseForValidCommentData() {
        Comment comment = new Comment(DATA);
        assertFalse(comment.isXmlDeclaration());
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