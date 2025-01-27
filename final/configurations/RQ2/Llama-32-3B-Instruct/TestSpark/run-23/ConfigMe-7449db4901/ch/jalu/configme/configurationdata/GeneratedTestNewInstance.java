package ch.jalu.configme.configurationdata;

public class GeneratedTestNewInstance {

    @Test
    public void testNewInstance() {
        CommentsConfiguration commentsConfig1 = new CommentsConfiguration(new HashMap<>());

        // Create a copy of the map for comments configuration 2
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        comments.put("path2", Arrays.asList("line2"));

        CommentsConfiguration commentsConfig2 = new CommentsConfiguration(comments);

        // Test that both instances are not equal
        assertNotEquals(commentsConfig1, commentsConfig2);
    }

}