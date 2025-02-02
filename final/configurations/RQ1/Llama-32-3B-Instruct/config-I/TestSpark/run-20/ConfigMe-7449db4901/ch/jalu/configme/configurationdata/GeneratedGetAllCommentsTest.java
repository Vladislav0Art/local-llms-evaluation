package ch.jalu.configme.configurationdata;

public class GeneratedGetAllCommentsTest {

    private CommentsConfiguration commentsConfig;

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("line1", "line2"));
        this.commentsConfig = new CommentsConfiguration(map);
        Map<String, @UnmodifiableView List<String>> allComments = commentsConfig.getAllComments();
        assertTrue(allComments.keySet().equals(map.keySet()));
    }

}