package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("my_path", "my_comment");

        assertEquals("my_comment", commentsConfiguration.getAllComments().get("my_path").get(0));
    }

}