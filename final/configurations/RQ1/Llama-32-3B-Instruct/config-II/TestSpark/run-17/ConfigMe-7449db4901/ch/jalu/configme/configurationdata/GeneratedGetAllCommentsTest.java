package ch.jalu.configme.configurationdata;

public class GeneratedGetAllCommentsTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> expectedCommentsMap = new HashMap<>();
        expectedCommentsMap.put("test", Arrays.asList("line1", "line2"));
        commentsConfiguration = new CommentsConfiguration(expectedCommentsMap);
        assertEquals(expectedCommentsMap, commentsConfiguration.getAllComments());
    }

}