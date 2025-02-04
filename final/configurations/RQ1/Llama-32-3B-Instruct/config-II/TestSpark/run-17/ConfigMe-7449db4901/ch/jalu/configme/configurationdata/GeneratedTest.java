package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void newCommentsConfigurationTest() {
        commentsConfiguration = new CommentsConfiguration();
        assertNull(commentsConfiguration.comments);
    }

    @Test
    public void existingCommentsConfigurationTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("test", Arrays.asList("line1", "line2"));
        commentsConfiguration = new CommentsConfiguration(commentsMap);
        assertNotNull(commentsConfiguration.comments);
        assertEquals(commentsMap, commentsConfiguration.comments);
    }

    @Test
    public void setCommentNewPathTest() {
        Map<String, List<String>> expectedCommentsMap = new HashMap<>();
        expectedCommentsMap.put("new", Arrays.asList("line1", "line2"));
        commentsConfiguration = new CommentsConfiguration(expectedCommentsMap);
        commentsConfiguration.setComment("new", "line3");
        assertEquals(expectedCommentsMap, commentsConfiguration.comments);
    }

    @Test
    public void setCommentExistingPathTest() {
        Map<String, List<String>> expectedCommentsMap = new HashMap<>();
        expectedCommentsMap.put("existing", Arrays.asList("line1", "line2"));
        commentsConfiguration = new CommentsConfiguration(expectedCommentsMap);
        commentsConfiguration.setComment("existing", "newLine");
        assertEquals(expectedCommentsMap, commentsConfiguration.comments);
    }

    @Test
    public void setEmptyPathTest() {
        Map<String, List<String>> expectedCommentsMap = new HashMap<>();
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("", Arrays.asList("line1", "line2"));
        assertEquals(expectedCommentsMap, commentsConfiguration.comments);
    }

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> expectedCommentsMap = new HashMap<>();
        expectedCommentsMap.put("test", Arrays.asList("line1", "line2"));
        commentsConfiguration = new CommentsConfiguration(expectedCommentsMap);
        assertEquals(expectedCommentsMap, commentsConfiguration.getAllComments());
    }

    @Test
    public void getAllCommentsEmptyMapTest() {
        Map<String, List<String>> expectedCommentsMap = Collections.emptyMap();
        commentsConfiguration = new CommentsConfiguration();
        assertEquals(expectedCommentsMap, commentsConfiguration.getAllComments());
    }

}