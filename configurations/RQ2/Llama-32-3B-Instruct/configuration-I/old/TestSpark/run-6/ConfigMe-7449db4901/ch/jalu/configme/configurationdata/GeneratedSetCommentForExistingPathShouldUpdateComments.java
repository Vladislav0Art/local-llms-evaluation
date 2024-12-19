package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentForExistingPathShouldUpdateComments {

    @Mock
    private Map<String, List<String>> commentsMap;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void setCommentForExistingPathShouldUpdateComments() {
        when(commentsMap.size()).thenReturn(1);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "line1");
        assertEquals(1, commentsConfiguration.getAllComment("path").size());
    }

}