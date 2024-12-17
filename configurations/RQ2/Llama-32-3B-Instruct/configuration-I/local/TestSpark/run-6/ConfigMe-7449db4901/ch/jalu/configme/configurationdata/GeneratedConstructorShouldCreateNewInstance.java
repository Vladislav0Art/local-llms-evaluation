package ch.jalu.configme.configurationdata;

public class GeneratedConstructorShouldCreateNewInstance {

    @Mock
    private Map<String, List<String>> commentsMap;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void constructorShouldCreateNewInstance() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertNotNull(commentsConfiguration);
    }

}