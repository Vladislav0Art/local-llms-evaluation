package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_MultipleLineComments_CommentsSet {

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

}