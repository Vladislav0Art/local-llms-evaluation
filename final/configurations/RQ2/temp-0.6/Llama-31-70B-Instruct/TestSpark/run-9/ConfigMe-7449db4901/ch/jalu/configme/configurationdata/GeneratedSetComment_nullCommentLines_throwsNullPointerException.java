package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_nullCommentLines_throwsNullPointerException {

    @Test
    public void setComment_nullCommentLines_throwsNullPointerException() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "some.path";
        config.setComment(path, (String[]) null);
    }

}