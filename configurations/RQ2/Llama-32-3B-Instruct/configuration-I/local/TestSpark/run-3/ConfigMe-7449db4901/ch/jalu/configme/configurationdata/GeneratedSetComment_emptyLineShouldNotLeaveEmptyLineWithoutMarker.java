package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_emptyLineShouldNotLeaveEmptyLineWithoutMarker {

    @Mock
    private Map<String, List<String>> commentsMap;

    public static void main(String[] args) {
        CommentsConfigurationTest test = new CommentsConfigurationTest();
    }

    @Test
    public void setComment_emptyLineShouldNotLeaveEmptyLineWithoutMarker() {
        commentsConfiguration.setComment("path", "", "comment");
        assertTrue(!commentsConfiguration.getAllComments().get("path").isEmpty());
    }

}