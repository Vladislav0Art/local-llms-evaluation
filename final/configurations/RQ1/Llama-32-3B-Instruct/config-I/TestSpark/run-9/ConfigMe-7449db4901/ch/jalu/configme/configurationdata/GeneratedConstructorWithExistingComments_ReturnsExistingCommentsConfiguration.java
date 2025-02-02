package ch.jalu.configme.configurationdata;

public class GeneratedConstructorWithExistingComments_ReturnsExistingCommentsConfiguration {

    @Test
    public void constructorWithExistingComments_ReturnsExistingCommentsConfiguration() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(existingComments);
        assertEquals(existingComments, commentsConfiguration.getComments());
    }

}