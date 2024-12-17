package ch.jalu.configme.configurationdata;

public class GeneratedTestNewCommentsConfigurationWithMap {

    @Test
    public void testNewCommentsConfigurationWithMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("test", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertEquals(comments, config.comments);
    }

}