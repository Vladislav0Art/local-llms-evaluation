package ch.jalu.configme.configurationdata;

public class GeneratedGetAllCommentsReturnsUnmodifiableMap {

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
    public void getAllCommentsReturnsUnmodifiableMap() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Object map = commentsConfiguration.getAllComments();
        assertNotNull(map);
        assertFalse(map instanceof java.util.Map.Entry);
    }

}