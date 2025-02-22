package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentWithNullCommentsTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentWithNullCommentsTest() {
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", null);

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals(Collections.singletonList(null),
                commentsConfiguration.getAllComments().get("path"));
    }

}