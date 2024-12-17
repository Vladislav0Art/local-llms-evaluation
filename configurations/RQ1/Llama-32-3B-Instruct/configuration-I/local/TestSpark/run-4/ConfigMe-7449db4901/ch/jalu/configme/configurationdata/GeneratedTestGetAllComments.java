package ch.jalu.configme.configurationdata;

public class GeneratedTestGetAllComments {

    @Test
    public void testGetAllComments() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "line1");
        config.setComment("path2", "line2");

        assertEquals(Arrays.asList("line1", "line2"), config.getAllComments());
    }

}