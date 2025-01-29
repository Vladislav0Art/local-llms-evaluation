package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentsConfigurationBuilder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void testCommentsSet() {
        String path = "path/to/comments";
        List<String> commentLines = Arrays.asList("line 1\n", "line 2");
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        builder.setComment(path, commentLines);
        assertEquals(3, builder.getAllComments().size());
        assertEquals(2, builder.getAllComments().get(path).size());
    }

    @Test
    public void testAllComments() {
        String path = "path/to/all/comments";
        List<String> commentLines = new ArrayList<>();
        commentLines.add("");
        commentLines.add("line 1\n");
        commentLines.add("line 2\n");
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        builder.setComment(path, commentLines);
        assertEquals(4, builder.getAllComments().size());
        assertEquals(3, builder.getAllComments().get(path).size());
    }

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

    @Test
    public void testSettingsHolder() {
        String path = "path/to/settings";
        Map<String, List<String>> settings = new HashMap<>();
        settings.put("setting", Collections.singletonList("value"));
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        builder.setComment(path, "", settings);
        assertEquals(1, builder.getAllComments().get(path).size());
    }

}