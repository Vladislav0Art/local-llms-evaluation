package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_nullPath_throwsNullPointerException {

    @Test
    public void setComment_nullPath_throwsNullPointerException() {
        CommentsConfiguration config = new CommentsConfiguration();
        String[] commentLines = new String[]{"comment1", "comment2"};
        config.setComment(null, commentLines);
    }

}