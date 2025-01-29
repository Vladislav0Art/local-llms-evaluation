package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentsConfigurationBuilder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAllCommentTypes {

    @Test
    public void testAllCommentTypes() {
        String path = "path/to/all/comment-types";
        List<CommentType> commentTypes = Arrays.asList(CommentType.LINE, CommentType.LOCALE);
        for (CommentType type : commentTypes) {
            CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
            builder.setComment(path, type, commentLines -> Arrays.asList(type.toString()));
            assertEquals(4, builder.getAllComments().size());
            assertEquals(3, builder.getAllComments().get(path).size());
        }
    }

}