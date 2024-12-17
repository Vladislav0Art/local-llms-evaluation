package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_singleLineCommentShouldBeAddedAsSingleElementList {

    @Mock
    private Map<String, List<String>> commentsMap;

    public static void main(String[] args) {
        CommentsConfigurationTest test = new CommentsConfigurationTest();
    }

    @Test
    public void setComment_singleLineCommentShouldBeAddedAsSingleElementList() {
        commentsConfiguration.setComment("path", "comment");
        assertEquals(1, commentsConfiguration.getAllComments().get("path").size());
    }

}