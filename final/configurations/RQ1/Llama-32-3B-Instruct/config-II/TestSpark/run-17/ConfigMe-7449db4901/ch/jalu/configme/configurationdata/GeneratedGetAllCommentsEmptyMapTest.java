package ch.jalu.configme.configurationdata;

public class GeneratedGetAllCommentsEmptyMapTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void getAllCommentsEmptyMapTest() {
        Map<String, List<String>> expectedCommentsMap = Collections.emptyMap();
        commentsConfiguration = new CommentsConfiguration();
        assertEquals(expectedCommentsMap, commentsConfiguration.getAllComments());
    }

}