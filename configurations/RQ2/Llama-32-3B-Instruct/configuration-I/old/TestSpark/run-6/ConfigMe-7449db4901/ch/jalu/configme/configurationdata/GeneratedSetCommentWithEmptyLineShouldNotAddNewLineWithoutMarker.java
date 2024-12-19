package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentWithEmptyLineShouldNotAddNewLineWithoutMarker {

    @Mock
    private Map<String, List<String>> commentsMap;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void setCommentWithEmptyLineShouldNotAddNewLineWithoutMarker() {
        when(commentsMap.size()).thenReturn(1);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "", "line2");
        assertEquals(1, commentsConfiguration.getAllComment("path").size());
    }

}