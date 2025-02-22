package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetComment_validPathAndCommentLines_successful {

    @Test
    public void setComment_validPathAndCommentLines_successful() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = new String[]{"line1", "line2"};
        commentsConfiguration.setComment(path, commentLines);
        assertEquals(Arrays.asList(commentLines), commentsConfiguration.getAllComments().get(path));
    }

}