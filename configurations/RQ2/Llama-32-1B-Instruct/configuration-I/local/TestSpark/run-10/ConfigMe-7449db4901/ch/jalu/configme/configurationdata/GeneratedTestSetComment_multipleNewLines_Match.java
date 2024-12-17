package ch.jalu.configme.configurationdata;

public class GeneratedTestSetComment_multipleNewLines_Match {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testSetComment_multipleNewLines_Match() {
        String path = "path";
        List<String> commentLines = Arrays.asList("line1", "line2");
        when(commentsConfiguration.setComment(path, commentLines)).thenAnswer(invocation -> {
            if (invocation.getArguments().contains("new-line")) {
                return true;
            }
            return false;
        });
        assertEquals(true, commentsConfiguration.setComment(path, commentLines));
    }

}