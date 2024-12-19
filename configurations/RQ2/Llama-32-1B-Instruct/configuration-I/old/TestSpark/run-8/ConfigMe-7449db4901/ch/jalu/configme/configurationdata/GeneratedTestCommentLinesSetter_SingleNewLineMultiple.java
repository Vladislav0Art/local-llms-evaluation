package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCommentLinesSetter_SingleNewLineMultiple {

    @Test
    public void testCommentLinesSetter_SingleNewLineMultiple() {
        String path = "path";
        List<String> commentLines = Arrays.asList("comment1\ncomment2");
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment(path, commentLines);
        assertEquals(1, commentsConfig.getAllComments().size());
    }

}