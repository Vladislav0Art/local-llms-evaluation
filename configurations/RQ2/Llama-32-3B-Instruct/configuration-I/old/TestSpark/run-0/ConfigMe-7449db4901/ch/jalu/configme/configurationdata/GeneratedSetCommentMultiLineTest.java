package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentMultiLineTest {

    @Test
    public void setCommentMultiLineTest() {
        // Arrange, Act & Assert
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);
        String[] commentLines = {"comment1", "comment2"};
        config.setComment("path", commentLines);
        Assertions.assertEquals(Arrays.asList(commentLines), config.getComment("path"));
    }

}