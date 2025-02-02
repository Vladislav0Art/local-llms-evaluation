package ch.jalu.configme.configurationdata;

public class GeneratedConstructorTest {

    @Mock
    private SettingsHolder settingsHolder;

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        commentsConfiguration.setCommentsMap(commentsConfiguration.getCommentsMap());
    }

    @Test
    public void constructorTest() {
        assertNotNull(commentsConfiguration.getComments());
        assertEquals(0, commentsConfiguration.getComments().size());
    }

}