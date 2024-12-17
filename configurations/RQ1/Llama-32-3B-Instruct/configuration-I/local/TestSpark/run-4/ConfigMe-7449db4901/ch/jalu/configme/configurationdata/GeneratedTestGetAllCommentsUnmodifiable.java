package ch.jalu.configme.configurationdata;

public class GeneratedTestGetAllCommentsUnmodifiable {

    @Test
    public void testGetAllCommentsUnmodifiable() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("test", Arrays.asList("line1", "line2"));

        config.setComment("test", "line1");
        config.setComment("test", "line2");

        assertEquals(Arrays.asList("line1", "line2"), config.getAllComments());
    }
}

public class CommentsConfiguration {
    private Map<String, List<String>> comments;

    public CommentsConfiguration() {
        this.comments = new HashMap<>();
    }

    public void setComment(String path, String line) {
        if (!comments.containsKey(path)) {
            comments.put(path, new ArrayList<>());
        }
        comments.get(path).add(line);
    }

    public Map<String, List<String>> getAllComments() {
        return new HashMap<>(comments); // return an unmodifiable map
    }

}