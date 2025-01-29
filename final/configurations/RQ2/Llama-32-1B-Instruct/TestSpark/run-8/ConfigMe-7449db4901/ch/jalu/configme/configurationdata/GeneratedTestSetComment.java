package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentLine;
import ch.jalu.configme.configurationdata.FileComment;
import ch.jalu.configme.configurationdata.CommentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GeneratedTestSetComment {

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void testSetComment() {
        String path = "path";
        String[] commentLines = {"line1", "", "line3"};
        commentsConfiguration.setComment(path, commentLines);
        Assertions.assertEquals(2, commentsConfiguration.getAllComments().size());
        Assertions.assertEquals(CommentLine.LINE_1, commentsConfiguration.getAllComments().get(path).get(0));
    }

}