package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfiguration_fromMap_isInitialized {

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
    public void newCommentsConfiguration_fromMap_isInitialized() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        String commentLines[] = {"line1", "line2"};
        String path = "/path";
        CommentsConfiguration config = CommentsConfiguration.fromMap(commentsMap);
        assertEquals(Arrays.asList(commentLines), config.comments.get(path));
    }

}