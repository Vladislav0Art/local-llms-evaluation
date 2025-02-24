package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_SingleLineComment_CommentSet {

    @Test
    public void setComment_SingleLineComment_CommentSet() {
        // Arrange
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test-path";
        String commentLine = "This is a comment";

        // Act
        commentsConfiguration.setComment(path, commentLine);

        // Assert
        assertEquals(commentLine, commentsConfiguration.getAllComments().get(path).get(0));
    }

}