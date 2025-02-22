package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentTest() {
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "commentLine1", "commentLine2");

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals(Arrays.asList("commentLine1", "commentLine2"),
                commentsConfiguration.getAllComments().get("path"));
    }

    @Test
    public void setCommentWithEmptyPathTest() {
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("", "commentLine1", "commentLine2");

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals(Arrays.asList("commentLine1", "commentLine2"),
                commentsConfiguration.getAllComments().get(""));
    }

    @Test
    public void setCommentWithNullCommentsTest() {
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", null);

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals(Collections.singletonList(null),
                commentsConfiguration.getAllComments().get("path"));
    }

    @Test
    public void setCommentWithEmptyCommentsTest() {
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "");

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals(Collections.singletonList(""),
                commentsConfiguration.getAllComments().get("path"));
    }

    @Test
    public void setCommentWithNullPathTest() {
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(null, "commentLine1", "commentLine2");

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals(Arrays.asList("commentLine1", "commentLine2"),
                commentsConfiguration.getAllComments().get(null));
    }

}