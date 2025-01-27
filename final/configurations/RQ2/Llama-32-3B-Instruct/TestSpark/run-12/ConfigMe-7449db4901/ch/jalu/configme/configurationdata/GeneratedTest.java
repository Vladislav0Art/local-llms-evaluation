package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private Map<String, Object[]> commentMap;

    public SettingsHolder(Map<String, Object[]> commentMap) {
        this.commentMap = commentMap;
    }

    public Map<String, Object[]> getCommentMap() {
        return commentMap;
    }
}

public class CommentsConfiguration {
    private String path;
    private List<String> commentLines;

    public void setComment(String path, List<String> commentLines) {
        this.path = path;
        this.commentLines = commentLines;
    }

    public Map<String, Object[]> getAllComments() {
        Map<String, Object[]> map = new HashMap<>();
        // Add code to populate the map
        return map;
    }
}

public class GeneratedTest {

    @Mock
    private CommentsConfiguration commentsConfiguration;

    @InjectMocks
    private SettingsHolder settingsHolder;

}