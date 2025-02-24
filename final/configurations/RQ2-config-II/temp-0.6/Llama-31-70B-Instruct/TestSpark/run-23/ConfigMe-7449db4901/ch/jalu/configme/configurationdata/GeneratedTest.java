package ch.jalu.configme.configurationdata;

public class GeneratedTest {

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

    @Test
    public void setComment_MultipleLineComments_CommentsSet() {
        // Arrange
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test-path";
        String commentLine1 = "This is a comment";
        String commentLine2 = "This is another comment";

        // Act
        commentsConfiguration.setComment(path, commentLine1, commentLine2);

        // Assert
        assertEquals(Arrays.asList(commentLine1, commentLine2), commentsConfiguration.getAllComments().get(path));
    }

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