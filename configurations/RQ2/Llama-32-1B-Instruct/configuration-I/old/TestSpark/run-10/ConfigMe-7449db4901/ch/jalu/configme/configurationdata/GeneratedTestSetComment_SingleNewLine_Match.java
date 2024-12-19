package ch.jalu.configme.configurationdata;

public class GeneratedTestSetComment_SingleNewLine_Match {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testSetComment_SingleNewLine_Match() {
        String path = "path";
        List<String> commentLines = Collections.singletonList("");
        when(commentsConfiguration.setComment(path, "", commentLines)).thenAnswer(invocation -> {
            if (invocation.getArguments().contains("new-line")) {
                return true;
            }
            return false;
        });
        assertEquals(true, commentsConfiguration.setComment(path, "", ""));
    }

}