package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentSingleLineTest {

    @Test
    public void setCommentSingleLineTest() {
        // Arrange, Act & Assert
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);
        config.setComment("path", "");
        Assertions.assertEquals(0, config.getComment("path").size());
    }

}