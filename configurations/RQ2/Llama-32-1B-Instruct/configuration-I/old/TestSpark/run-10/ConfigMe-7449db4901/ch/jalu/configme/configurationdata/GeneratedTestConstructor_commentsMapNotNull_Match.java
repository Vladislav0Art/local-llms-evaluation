package ch.jalu.configme.configurationdata;

public class GeneratedTestConstructor_commentsMapNotNull_Match {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testConstructor_commentsMapNotNull_Match() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        comments.put("path2", Collections.singletonList("line2"));
        when(new CommentsConfiguration(null)).anyOf(comments);
        assertEquals(2, comments.size());
    }

}