package ch.jalu.configme.configurationdata;

public class GeneratedGetComments_ReturnsMap {

    @Test
    public void getComments_ReturnsMap() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> expected = new HashMap<>();
        comments.setComment("path", Arrays.asList("line1", "line2"));
        Map<String, List<String>> result = comments.getComments();
        assertEquals(expected, result);
    }

}