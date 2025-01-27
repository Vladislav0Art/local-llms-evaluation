package ch.jalu.configme.configurationdata;

public class GeneratedExistingComment_configuration_addMultipleLines {

    @Test
    public void existingComment_configuration_addMultipleLines() {
        String comment1 = "# Comment 1";
        String comment2 = "# Comment 2";
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key", Arrays.asList(comment1, comment2));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        List<String> result = config.getAllComments();
        assertEquals(2, result.size());
        assertTrue(result.contains(comment1) && result.contains(comment2));
    }

}