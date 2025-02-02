package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_addsMultipleLines {

    private Map<String, List<String>> comments;

    public CommentsConfiguration() {
    }

    public static CommentsConfiguration createInstance() {
        return new CommentsConfiguration();
    }

    public static CommentsConfiguration fromMap(Map<String, List<String>> comments) {
        return new CommentsConfiguration(comments);
    }

    public void setComment(String path, String... lines) {
        if (lines.length == 1) {
            if (!comments.containsKey(path)) {
                comments.put(path, new ArrayList<>());
            }
            ((List<String>) comments.get(path)).add("");
        } else {
            comments.putIfAbsent(path, new ArrayList<>());
            for (String line : lines) {
                ((List<String>) comments.get(path)).add(line);
            }
        }
    }

    public List<String> getComment(String path) {
        return comments.getOrDefault(path, Collections.emptyList());
    }

    public Map<String, List<String>> getAllComments() {
        return new HashMap<>(comments);
    }
}

public class GeneratedTest {

    @Test
    public void setComment_addsMultipleLines() {
        CommentsConfiguration config = CommentsConfiguration.createInstance();
        String path = "/path";
        config.setComment(path, "line1", "line2");
        assertEquals(Arrays.asList("line1", "line2"), config.comments.get(path));
    }

}