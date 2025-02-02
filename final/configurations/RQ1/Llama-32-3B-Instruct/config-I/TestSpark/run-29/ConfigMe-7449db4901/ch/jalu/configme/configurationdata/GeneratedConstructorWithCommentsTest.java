package ch.jalu.configme.configurationdata;

public class GeneratedConstructorWithCommentsTest {

    public Map<String, List<String>> comments = new HashMap<>();

    public CommentsConfiguration() {
    }

    public void setComment(String key, String value) {
    }
}

public class CommentsConfigurationTest {

    @Test
    public void constructorWithCommentsTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", List.of("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        assertEquals(commentsMap, config.comments);
    }

}