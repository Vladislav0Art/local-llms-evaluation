package ch.jalu.configme.configurationdata;

public class GeneratedExistingCommentsConfigurationTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void existingCommentsConfigurationTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("test", Arrays.asList("line1", "line2"));
        commentsConfiguration = new CommentsConfiguration(commentsMap);
        assertNotNull(commentsConfiguration.comments);
        assertEquals(commentsMap, commentsConfiguration.comments);
    }

}