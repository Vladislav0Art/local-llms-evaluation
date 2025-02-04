package org.jsoup.nodes;

public class GeneratedOuterHtmlTailIsNotCalled {

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

}