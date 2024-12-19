package ch.jalu.configme.configurationdata;

public class GeneratedGetAllCommentsShouldReturnReadOnlyView {

    @Mock
    private Map<String, List<String>> commentsMap;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getAllCommentsShouldReturnReadOnlyView() {
        Map<String, List<String>> expected = Map.of("key1", List.of("value1"));
        when(commentsMap).thenReturn(expected);
        assertTrue(commentsConfiguration.getAllComment("key1").isEmpty());
    }

}