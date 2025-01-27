package ch.jalu.configme.configurationdata;

public class GeneratedDefaultConstructor {

    @Mock
    private SettingsHolder settingsHolder;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void defaultConstructor() {
        assertNotNull(commentsConfiguration);
    }

}