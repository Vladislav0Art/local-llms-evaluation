package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentWithEmptyCommentsTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentWithEmptyCommentsTest() {
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "");

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals(Collections.singletonList(""),
                commentsConfiguration.getAllComments().get("path"));
    }

}