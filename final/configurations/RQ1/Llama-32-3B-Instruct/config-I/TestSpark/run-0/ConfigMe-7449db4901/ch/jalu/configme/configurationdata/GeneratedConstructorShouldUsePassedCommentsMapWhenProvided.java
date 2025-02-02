package ch.jalu.configme.configurationdata;

public class GeneratedConstructorShouldUsePassedCommentsMapWhenProvided {

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
    public void constructorShouldUsePassedCommentsMapWhenProvided() {
        Map<String, @UnmodifiableView List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        CommentsConfiguration c = new CommentsConfiguration(comments);
        assertEquals(comments, c.getAllComments());
    }

}