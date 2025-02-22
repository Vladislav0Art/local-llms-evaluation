package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentWithEmptyPathTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentWithEmptyPathTest() {
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("", "commentLine1", "commentLine2");

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals(Arrays.asList("commentLine1", "commentLine2"),
                commentsConfiguration.getAllComments().get(""));
    }

}