package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentsConfigurationBuilder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestAllComments {

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

}