package ch.jalu.configme.configurationdata;

public class GeneratedExistingComment_configuration_removeMultipleLines {

    @Test
    public void existingComment_configuration_removeMultipleLines() {
        String comment1 = "# Comment 1";
        String comment2 = "# Comment 2";
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key", Arrays.asList(comment1, comment2));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        config.removeLine();
        List<String> result = config.getAllComments();
        assertEquals(0, result.size());
    }
}

public class CommentsConfiguration {
    private Map<String, List<String>> comments;

    public CommentsConfiguration(Map<String, List<String>> comments) {
        this.comments = comments;
    }

    public List<String> getAllComments() {
        return comments.get("key");
    }

    public void removeLine() {
        if (comments.containsKey("key") && !comments.get("key").isEmpty()) {
            comments.get("key").remove(0);
        }
    }
}

public class CommentsConfigurationBuilder {
    private Map<String, List<String>> comments;

    public CommentsConfigurationBuilder withComments(Map<String, List<String>> comments) {
        this.comments = comments;
        return this;
    }

    public CommentsConfiguration build() {
        return new CommentsConfiguration(comments);
    }

}