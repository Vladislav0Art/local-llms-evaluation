package ch.jalu.configme.configurationdata;

public class GeneratedConstructorWithCommentsMapShouldInitializeComments {

    @Mock
    private Map<String, List<String>> commentsMap;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void constructorWithCommentsMapShouldInitializeComments() {
        when(commentsMap.size()).thenReturn(1);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        assertNotNull(commentsConfiguration.getComment("key"));
    }

}