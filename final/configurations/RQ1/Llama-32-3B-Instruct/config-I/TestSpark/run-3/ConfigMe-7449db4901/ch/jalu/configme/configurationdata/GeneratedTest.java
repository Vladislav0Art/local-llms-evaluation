package ch.jalu.configme.configurationdata;

public class GeneratedTest {

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
    public void newCommentsConfiguration_isInitialized() {
        CommentsConfiguration config = CommentsConfiguration.createInstance();
        assertNotNull(config.comments);
    }

    @Test
    public void newCommentsConfiguration_fromMap_isInitialized() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        String commentLines[] = {"line1", "line2"};
        String path = "/path";
        CommentsConfiguration config = CommentsConfiguration.fromMap(commentsMap);
        assertEquals(Arrays.asList(commentLines), config.comments.get(path));
    }

    @Test
    public void setComment_addsNewLineForEmptyString() {
        CommentsConfiguration config = CommentsConfiguration.createInstance();
        List<String> commentLines = new ArrayList<>();
        String path = "/path";
        commentLines.add("");
        config.setComment(path, commentLines.toArray(new String[0]));
        assertEquals(1, ((List<String>) config.comments.get(path)).size());
    }

    @Test
    public void setComment_addsMultipleNewLinesForEmptyString() {
        CommentsConfiguration config = CommentsConfiguration.createInstance();
        List<String> commentLines = new ArrayList<>();
        String path = "/path";
        Arrays.fill(commentLines.toArray(new String[0]), "");
        config.setComment(path, commentLines);
        assertEquals(1, ((List<String>) config.comments.get(path)).size());
    }

    @Test
    public void setComment_addsMultipleLines() {
        CommentsConfiguration config = CommentsConfiguration.createInstance();
        String path = "/path";
        config.setComment(path, "line1", "line2");
        assertEquals(Arrays.asList("line1", "line2"), config.comments.get(path));
    }

    @Test
    public void getAllComments_returnCorrectMap() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        String commentLines[] = {"line1", "line2"};
        CommentsConfiguration config = CommentsConfiguration.fromMap(commentsMap);
        assertEquals(commentsMap, config.getAllComments());
    }

}