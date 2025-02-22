package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentTest() {
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "commentLine1", "commentLine2");

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals(Arrays.asList("commentLine1", "commentLine2"),
                commentsConfiguration.getAllComments().get("path"));
    }

}