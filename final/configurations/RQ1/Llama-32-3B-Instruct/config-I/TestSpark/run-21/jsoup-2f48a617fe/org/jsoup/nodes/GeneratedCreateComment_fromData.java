package org.jsoup.nodes;

public class GeneratedCreateComment_fromData {

    private static final String EMPTY_COMMENT = "#comment";
    private static final String DATA_COMMENT = "#comment> data</#comment>";
    private static final String XML_DECLARATION_DATA = "<!XML Declaration>";
    private static final String XML_DECLARATION_FRAGMENT = "<" + XML_DECLARATION_DATA + ">";
    private static final Document doc = new Document();
    private static final Comment comment = new Comment(DATA_COMMENT);

    @Test
    public void createComment_fromData() {
        Comment createdComment = new Comment("data");
        assertEquals(EMPTY_COMMENT, createdComment.nodeName());
        assertTrue(createdComment.getData().equals("data"));
    }

}