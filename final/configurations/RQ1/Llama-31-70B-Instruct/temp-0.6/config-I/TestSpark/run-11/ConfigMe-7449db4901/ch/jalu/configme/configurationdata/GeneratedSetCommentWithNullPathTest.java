package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentWithNullPathTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentWithNullPathTest() {
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(null, "commentLine1", "commentLine2");

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals(Arrays.asList("commentLine1", "commentLine2"),
                commentsConfiguration.getAllComments().get(null));
    }

}