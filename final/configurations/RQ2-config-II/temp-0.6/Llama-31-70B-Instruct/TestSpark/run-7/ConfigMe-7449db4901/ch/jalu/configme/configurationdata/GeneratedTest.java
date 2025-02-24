package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("my_path", "my_comment");

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertEquals(1, allComments.size());
        assertEquals("my_comment", allComments.get("my_path").get(0));
    }

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("my_path", "my_comment");

        assertEquals("my_comment", commentsConfiguration.getAllComments().get("my_path").get(0));
    }

    @Test
    public void setCommentMultipleCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("my_path", "my_comment1", "my_comment2");

        assertEquals("my_comment1", commentsConfiguration.getAllComments().get("my_path").get(0));
        assertEquals("my_comment2", commentsConfiguration.getAllComments().get("my_path").get(1));
    }

    @Test
    public void setCommentEmptyCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("my_path");

        assertEquals(0, commentsConfiguration.getAllComments().get("my_path").size());
    }

}