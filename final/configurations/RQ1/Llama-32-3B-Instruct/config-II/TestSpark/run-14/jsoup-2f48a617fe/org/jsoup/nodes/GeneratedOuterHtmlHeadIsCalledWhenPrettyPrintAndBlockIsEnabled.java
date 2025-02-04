package org.jsoup.nodes;

public class GeneratedOuterHtmlHeadIsCalledWhenPrettyPrintAndBlockIsEnabled {

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

}