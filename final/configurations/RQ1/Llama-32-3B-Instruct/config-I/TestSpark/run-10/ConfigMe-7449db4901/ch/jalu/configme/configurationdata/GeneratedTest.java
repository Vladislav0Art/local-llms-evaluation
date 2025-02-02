package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private Map<String, List<String>> comments;

    public CommentConfiguration() {
        this.comments = new HashMap<>();
    }

    public void addComment(String key, String value) {
        if (!comments.containsKey(key)) {
            comments.put(key, new ArrayList<>());
        }
        comments.get(key).add(value);
    }

    public Map<String, List<String>> getAllComments() {
        return Collections.unmodifiableMap(comments);
    }
}

public class CommentTest {

    private CommentConfiguration commentsConfiguration;

    @Before
    public void setup() {
        this.commentsConfiguration = new CommentConfiguration();
    }

}