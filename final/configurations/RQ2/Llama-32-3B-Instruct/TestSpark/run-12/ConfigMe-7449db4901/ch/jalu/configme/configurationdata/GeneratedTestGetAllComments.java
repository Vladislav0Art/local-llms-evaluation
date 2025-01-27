package ch.jalu.configme.configurationdata;

public class GeneratedTestGetAllComments {

    @Mock
    private SettingsHolder settingsHolder;

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testGetAllComments() {
        Map<String, Object[]> map = new HashMap<>();
        map.put("path1", new Object[]{"comment11", "comment12"});
        map.put("path2", new Object[]{"comment21", "comment22"});
        commentsConfiguration = new CommentsConfiguration(map);
        assertEquals(map, commentsConfiguration.getAllComments());
    }

}