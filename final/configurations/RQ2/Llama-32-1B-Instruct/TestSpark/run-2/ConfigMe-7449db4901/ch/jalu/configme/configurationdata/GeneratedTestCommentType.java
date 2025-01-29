package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentsConfigurationBuilder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCommentType {

    @Test
    public void testCommentType() {
        String path = "path/to/comment-type";
        List<String> commentLines = Arrays.asList("line 1\n", "line 2");
        CommentType type = CommentType.LINE;
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        builder.setComment(path, type, commentLines);
        assertEquals(3, builder.getAllComments().size());
        assertEquals(2, builder.getAllComments().get(path).size());
    }

}