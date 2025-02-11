package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    public static final List<String> COMMENT_LINES = Arrays.asList("line1", "line2");
    public static final Map<String, Object> EXPECTED = new HashMap<>();
    EXPECTED.put(PATH,COMMENT_LINES);

    @Mock
    private SettingsHolder settingsHolder;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

}