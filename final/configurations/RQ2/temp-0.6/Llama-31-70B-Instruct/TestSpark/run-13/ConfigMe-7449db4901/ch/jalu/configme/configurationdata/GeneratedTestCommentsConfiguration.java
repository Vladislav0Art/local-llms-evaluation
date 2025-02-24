package ch.jalu.configme.configurationdata;

public class GeneratedTestCommentsConfiguration {

    @Test
    public void testCommentsConfiguration() {
        // Arrange
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key", Arrays.asList("val"));

        // Act
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);

        // Assert
        assertNotNull(commentsConfiguration);
    }

}