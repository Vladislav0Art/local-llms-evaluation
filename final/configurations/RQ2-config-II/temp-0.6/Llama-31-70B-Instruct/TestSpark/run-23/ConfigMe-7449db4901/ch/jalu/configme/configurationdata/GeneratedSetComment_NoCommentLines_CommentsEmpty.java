package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_NoCommentLines_CommentsEmpty {

    @Test
    public void setComment_NoCommentLines_CommentsEmpty() {
        // Arrange
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test-path";

        // Act
        commentsConfiguration.setComment(path);

        // Assert
        assertEquals(Collections.emptyList(), commentsConfiguration.getAllComments().get(path));
    }

}