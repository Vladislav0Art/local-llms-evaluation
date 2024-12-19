package ch.jalu.configme.configurationdata;

public class GeneratedTestConstructor_commentsListNotNull_Match {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testConstructor_commentsListNotNull_Match() {
        List<String> lines = Arrays.asList("line1");
        when(new CommentsConfiguration(Arrays.asList(lines))).anyOf(comments());
        assertEquals(1, comments.size());
    }

}