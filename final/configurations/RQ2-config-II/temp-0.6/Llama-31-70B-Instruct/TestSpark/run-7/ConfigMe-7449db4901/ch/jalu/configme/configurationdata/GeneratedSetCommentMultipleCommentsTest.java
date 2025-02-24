package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentMultipleCommentsTest {

    @Test
    public void setCommentMultipleCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("my_path", "my_comment1", "my_comment2");

        assertEquals("my_comment1", commentsConfiguration.getAllComments().get("my_path").get(0));
        assertEquals("my_comment2", commentsConfiguration.getAllComments().get("my_path").get(1));
    }

}