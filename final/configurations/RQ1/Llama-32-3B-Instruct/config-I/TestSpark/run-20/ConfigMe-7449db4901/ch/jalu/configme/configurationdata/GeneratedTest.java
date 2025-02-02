package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private CommentsConfiguration commentsConfig;

    @Test
    public void newCommentsConfigurationTest() {
        this.commentsConfig = new CommentsConfiguration();
        assert commentsConfig.comments.isEmpty();
    }

    @Test
    public void newCommentsConfigurationWithExistingMapTest() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("line1", "line2"));
        commentsConfig = new CommentsConfiguration(map);
        assert commentsConfig.comments.equals(map);
    }

    @Test
    public void setCommentTest() {
        this.commentsConfig = new CommentsConfiguration();
        this.commentsConfig.setComment("path1", "line1");
        String path1 = commentsConfig.getAllComments().keySet().iterator().next();
        List<String> commentLines = commentsConfig.getAllComments().get(path1);
        assertTrue(commentLines.contains("line1"));
    }

    @Test
    public void setCommentWithEmptyLineTest() {
        this.commentsConfig = new CommentsConfiguration();
        this.commentsConfig.setComment("path1", "\n");
        String path1 = commentsConfig.getAllComments().keySet().iterator().next();
        List<String> commentLines = commentsConfig.getAllComments().get(path1);
        assertTrue(commentLines.isEmpty());
    }

    @Test
    public void setMultipleCommentsForSamePathTest() {
        this.commentsConfig = new CommentsConfiguration();
        this.commentsConfig.setComment("path1", "line1");
        this.commentsConfig.setComment("path2", "line2");
        String path1 = commentsConfig.getAllComments().keySet().iterator().next();
        List<String> commentLines = commentsConfig.getAllComments().get(path1);
        assertTrue(commentLines.contains("line1"));
    }

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("line1", "line2"));
        this.commentsConfig = new CommentsConfiguration(map);
        Map<String, @UnmodifiableView List<String>> allComments = commentsConfig.getAllComments();
        assertTrue(allComments.keySet().equals(map.keySet()));
    }

    @Test
    public void getAllCommentsIsReadOnlyTest() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("line1", "line2"));
        this.commentsConfig = new CommentsConfiguration(map);
        Map<String, @UnmodifiableView List<String>> allComments = commentsConfig.getAllComments();
        assert !allComments.keySet().contains("path1");
    }

}