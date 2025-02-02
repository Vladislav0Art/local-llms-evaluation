package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private Map<String, List<String>> comments = new HashMap<>();

    public void setComment(String path, String comment) {
        if (comments == null) {
            comments = new HashMap<>();
        }
        comments.put(path, Arrays.asList(comment));
    }

    public Map<String, @UnmodifiableView List<String>> getAllComments() {
        return Collections.unmodifiableMap(comments);
    }

    public void setComments(Map<String, List<String>> comments) {
        this.comments = comments;
    }
}

public class GeneratedTest {

    @Before
    public void setup() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, String> commentsMap = new HashMap<>();
        commentsMap.put("path1", "comment1");
        configuration.setComments(commentsMap);
    }

}