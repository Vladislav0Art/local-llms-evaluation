package ch.jalu.configme.configurationdata;

public class GeneratedTestGetComments {

    private CommentsConfiguration comments = new CommentsConfiguration();

    public void setComment(String path, List<String> lines) {
        this.comments.setComment(path, Arrays.asList(lines));
    }

    public String getComments() {
        return this.comments.getComments();
    }
}

public class CommentsConfiguration {
    public String setComment(String key, String[] value) {
        // implementation
    }

    public String getComments() {
        return "";
    }
}

public class GeneratedTest {

    private ConfigMe config;

    @Before
    public void setup() {
        this.config = new ConfigMe();
    }

    @Test
    public void testGetComments() {
        List<String> lines = Arrays.asList("line1", "line2");
        String key = "path1";
        this.config.setComment(key, lines);
        assert this.config.getComments().equals(lines);
    }

}