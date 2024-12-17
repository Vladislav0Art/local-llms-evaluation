package ch.jalu.configme.configurationdata;

public class GeneratedTestGetAllComments_Match {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testGetAllComments_Match() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        when(commentsConfiguration.getAllComments()).thenAnswer(invocation -> {
            return Map.of("path1", invocation.getArguments()[0], "path2", invocation.getArguments()[1]);
        });
        assertEquals(Map.of("path1", Collections.singletonList("line1"), "path2", Collections.emptyList()), comments);
    }

}