package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfiguration_withMapIsInitializedFromMap {

    @Mock
    private Map<String, List<String>> commentsMap;

    public static void main(String[] args) {
        CommentsConfigurationTest test = new CommentsConfigurationTest();
    }

    @Test
    public void newCommentsConfiguration_withMapIsInitializedFromMap() {
        when(commentsMap).anyArguments().thenReturn(commentsMap);
        assertNotNull(commentsConfiguration.getAllComments());
    }

}