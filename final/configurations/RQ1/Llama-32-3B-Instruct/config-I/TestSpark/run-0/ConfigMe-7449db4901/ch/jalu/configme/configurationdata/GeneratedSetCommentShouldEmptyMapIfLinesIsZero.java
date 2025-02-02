package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentShouldEmptyMapIfLinesIsZero {

    private Map<String, @UnmodifiableView List<String>> comments;

    public CommentsConfiguration(Map<String, @UnmodifiableView List<String>> comments) {
        this.comments = comments;
    }

    public Map<String, @UnmodifiableView List<String>> getAllComments() {
        return Collections.unmodifiableMap(comments);
    }

    public void setComment(String path, String[] lines) {
        if (lines == null || Arrays.asList(lines).isEmpty()) {
            this.comments.remove(path);
        } else {
            List<String> linesList = Arrays.asList(lines);
            this.comments.putIfAbsent(path, linesList);
        }
    }
}

public class GeneratedTest {

    @Test
    public void setCommentShouldEmptyMapIfLinesIsZero() {
        CommentsConfiguration c = new CommentsConfiguration(new HashMap<>());
        String[] lines = {};
        c.setComment("path1", lines);
        assertTrue(((List<String>) c.getAllComments().get("path1")).isEmpty());
    }

}