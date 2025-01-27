package ch.jalu.configme.configurationdata;

public class GeneratedExistingCommentsConfigurationIsEmpty {

    private java.util.Map<String, List<String>> allComments;

    public CommentsConfiguration() {
        if (this.allComments == null) {
            this.allComments = new HashMap<>();
        }
    }

    public java.util.Map<String, List<String>> getAllComments() {
        return this.allComments;
    }

    public void setComment(String path, String[] commentLines) {
        if (this.allComments == null) {
            this.allComments = new HashMap<>();
        }
        this.allComments.put(path, Arrays.asList(commentLines));
    }
}

public class CommentsConfigurationTest {

    @Test
    public void existingCommentsConfigurationIsEmpty() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(new HashMap<>());
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

}