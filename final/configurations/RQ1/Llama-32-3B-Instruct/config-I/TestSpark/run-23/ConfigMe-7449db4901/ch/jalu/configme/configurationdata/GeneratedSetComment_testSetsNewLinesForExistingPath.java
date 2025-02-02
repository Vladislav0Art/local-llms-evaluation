package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_testSetsNewLinesForExistingPath {

    @Mock
    private SettingsHolder settingsHolder;

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setComment_testSetsNewLinesForExistingPath() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.add("value");
        Map<String, List<String>> existingCommentsMap = new HashMap<>();
        existingCommentsMap.put("key", Arrays.asList("line1", "line2"));
        comments.putAll(existingCommentsMap);
        commentsConfiguration.setComments(comments);
        assertTrue(CommentsConfiguration.class.isAssignableFrom(commentsConfiguration.getClass()));
        assertTrue(comments instanceof java.util.Map);
    }

}