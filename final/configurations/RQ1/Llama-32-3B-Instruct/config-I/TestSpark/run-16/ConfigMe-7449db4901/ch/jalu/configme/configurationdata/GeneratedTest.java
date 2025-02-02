package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private java.util.Map<String, java.util.List<String>> comments;

    public void setComments(java.util.Map<String, java.util.List<String>> comments) {
        this.comments = comments;
    }

    public java.util.Map<String, java.util.List<String>> getComments() {
        return comments;
    }
}

public class CommentsConfigurationTest {

    @Test
    public void testComments() {
        // Create a new instance of CommentsConfiguration
        CommentsConfiguration config = new CommentsConfiguration();

        // Create an empty map to store comments
        java.util.Map<String, java.util.List<String>> comments = new java.util.HashMap<>();
        comments.put("", java.util.Arrays.asList("line1"));

        // Set the comments for config using setComments() method
        config.setComments(comments);
    }

    @Test
    public void testGetComments() {
        // Create a new instance of CommentsConfiguration
        CommentsConfiguration config = new CommentsConfiguration();

        // Create an empty map to store comments
        java.util.Map<String, java.util.List<String>> comments = new java.util.HashMap<>();
        comments.put("", java.util.Arrays.asList("line1"));

        // Set the comments for config using setComments() method
        config.setComments(comments);

        // Get comments from config using getComments() method and assert its values
        assertEquals(comments.get(""), config.getComments());
    }
}

class Comment {
    private String text;

    public Comment(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

}