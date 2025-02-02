package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_addsMultipleNewLinesForEmptyString {

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
    public void setComment_addsMultipleNewLinesForEmptyString() {
        CommentsConfiguration config = CommentsConfiguration.createInstance();
        List<String> commentLines = new ArrayList<>();
        String path = "/path";
        Arrays.fill(commentLines.toArray(new String[0]), "");
        config.setComment(path, commentLines);
        assertEquals(1, ((List<String>) config.comments.get(path)).size());
    }

}