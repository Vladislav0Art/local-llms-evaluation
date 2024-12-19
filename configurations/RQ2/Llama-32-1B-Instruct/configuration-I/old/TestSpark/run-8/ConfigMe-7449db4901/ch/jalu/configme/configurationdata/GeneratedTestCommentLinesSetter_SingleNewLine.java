package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCommentLinesSetter_SingleNewLine {

    @Test
    public void testCommentLinesSetter_SingleNewLine() {
        String path = "path";
        String...commentLines = {"comment1\ncomment2"};
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment(path, Arrays.asList(commentLines));
        assertEquals(1, commentsConfig.getAllComments().size());
    }

}