package ch.jalu.configme.configurationdata;

public class GeneratedConstructorTest {

    public Map<String, List<String>> comments = new HashMap<>();

    public CommentsConfiguration() {
    }

    public void setComment(String key, String value) {
    }
}

public class CommentsConfigurationTest {

    @Test
    public void constructorTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertTrue(config.comments.isEmpty());
    }

}