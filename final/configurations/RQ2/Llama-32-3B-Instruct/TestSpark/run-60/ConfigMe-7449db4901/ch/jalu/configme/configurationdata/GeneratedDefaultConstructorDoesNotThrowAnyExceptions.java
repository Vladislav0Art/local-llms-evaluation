package ch.jalu.configme.configurationdata;

public class GeneratedDefaultConstructorDoesNotThrowAnyExceptions {

    private Map<String, List<String>> comments;

    public CommentsConfiguration() {
        this.comments = new HashMap<>();
    }

    public void setComment(String path, List<String> commentLines) {
        if (path == null || commentLines == null) {
            throw new NullPointerException("Path and Comment lines cannot be null");
        }
        comments.put(path, commentLines);
    }

    public Map<String, List<String>> getAllComments() {
        return Collections.unmodifiableMap(comments);
    }
}

public class GeneratedTest {

    @Test
    public void defaultConstructorDoesNotThrowAnyExceptions() {
        CommentsConfiguration config = new CommentsConfiguration();
        // no checks here as we just create an object and do nothing else
    }

}