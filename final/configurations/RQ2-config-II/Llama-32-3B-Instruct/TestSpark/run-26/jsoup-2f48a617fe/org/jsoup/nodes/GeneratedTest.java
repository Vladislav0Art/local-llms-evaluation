package org.jsoup.nodes;

public class GeneratedTest {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("data");
    }

    @Test
    public void constructorHasCorrectData() {
        assertEquals("data", comment.getData());
    }

    @Test
    public void nodeNameReturnsExpectedValue() {
        String expectedNodeName = "comment";
        assertEquals(expectedNodeName, comment.nodeName());
    }

    @Test
    public void getDataReturnsCorrectValue() {
        String expectedData = "data";
        assertEquals(expectedData, comment.getData());
    }

    @Test
    public void setDataSetsCorrectData() {
        String newData = "new data";
        comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

    @Test
    public void outerHtmlHeadWorksAsExpected() throws IOException {
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new OutputSettings();
        comment.outerHtmlHead(accum, depth, out);
        String expectedHtml = "<!-- data -->";
        assertTrue(accum.toString().contains(expectedHtml));
    }

    @Test
    public void outerHtmlTailWorksAsExpected() {
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new OutputSettings();
        comment.outerHtmlTail(accum, depth, out);
        String expectedHtml = "";
        assertFalse(accum.toString().isEmpty());
    }

    @Test
    public void toStringReturnsExpectedString() {
        String expectedString = "<!-- data -->";
        assertEquals(expectedString, comment.toString());
    }

    @Test
    public void cloneCreatesNewCommentWithSameData() {
        Comment clonedComment = comment.clone();
        assertEquals(comment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclarationReturnsExpectedValue() {
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationWorksAsExpected() {
        XmlDeclaration expectedDeclaration = new XmlDeclaration("data");
        Comment commentToTest = new Comment("<!-- data -->");
        assertEquals(expectedDeclaration, commentToTest.asXmlDeclaration());
    }

}