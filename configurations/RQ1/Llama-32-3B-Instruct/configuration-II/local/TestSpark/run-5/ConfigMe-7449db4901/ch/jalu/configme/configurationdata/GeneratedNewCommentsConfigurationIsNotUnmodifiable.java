package ch.jalu.configme.configurationdata;

public class GeneratedNewCommentsConfigurationIsNotUnmodifiable {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void newCommentsConfigurationIsNotUnmodifiable() {
        Map<String, List<String>> expected = new HashMap<>();
        expected.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration newConfig = new CommentsConfiguration(expected);
        Assertions.assertEquals(expected, newConfig.getAllComments());
    }

}