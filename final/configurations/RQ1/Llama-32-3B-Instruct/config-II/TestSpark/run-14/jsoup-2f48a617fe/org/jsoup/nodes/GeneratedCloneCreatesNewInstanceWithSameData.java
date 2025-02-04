package org.jsoup.nodes;

public class GeneratedCloneCreatesNewInstanceWithSameData {

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
    public void cloneCreatesNewInstanceWithSameData() {
        Comment comment = new Comment(DATA);
        Comment clonedComment = comment.clone();
        assertEquals(comment.getData(), clonedComment.getData());
    }

}