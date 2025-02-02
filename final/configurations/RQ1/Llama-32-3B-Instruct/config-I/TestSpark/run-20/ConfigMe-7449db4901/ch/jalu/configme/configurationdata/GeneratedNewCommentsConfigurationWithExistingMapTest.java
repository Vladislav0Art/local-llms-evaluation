package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfigurationWithExistingMapTest {

    private CommentsConfiguration commentsConfig;

    @Test
    public void newCommentsConfigurationWithExistingMapTest() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("line1", "line2"));
        commentsConfig = new CommentsConfiguration(map);
        assert commentsConfig.comments.equals(map);
    }

}