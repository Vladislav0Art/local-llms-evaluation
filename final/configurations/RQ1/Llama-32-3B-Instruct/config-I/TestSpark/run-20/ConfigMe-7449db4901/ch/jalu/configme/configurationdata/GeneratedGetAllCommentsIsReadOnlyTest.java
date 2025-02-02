package ch.jalu.configme.configurationdata;

public class GeneratedGetAllCommentsIsReadOnlyTest {

    private CommentsConfiguration commentsConfig;

    @Test
    public void getAllCommentsIsReadOnlyTest() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("line1", "line2"));
        this.commentsConfig = new CommentsConfiguration(map);
        Map<String, @UnmodifiableView List<String>> allComments = commentsConfig.getAllComments();
        assert !allComments.keySet().contains("path1");
    }

}