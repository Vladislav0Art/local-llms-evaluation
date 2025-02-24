package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentEmptyCommentsTest {

    @Test
    public void setCommentEmptyCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("my_path");

        assertEquals(0, commentsConfiguration.getAllComments().get("my_path").size());
    }

}