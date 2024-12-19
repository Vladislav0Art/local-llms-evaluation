package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentOverwriteExistingTest {

    @Test
    public void setCommentOverwriteExistingTest() {
        // Arrange, Act & Assert
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);
        String[] commentLines = {"comment1", "comment2"};
        config.setComment("path", commentLines);
        config.setComment("path", Arrays.asList("newComment"));
        Assertions.assertEquals(Arrays.asList("newComment"), config.getComment("path"));
    }

}