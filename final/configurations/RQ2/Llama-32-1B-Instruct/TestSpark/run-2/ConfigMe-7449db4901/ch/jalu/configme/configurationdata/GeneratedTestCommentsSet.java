package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentsConfigurationBuilder;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCommentsSet {

    @Test
    public void testCommentsSet() {
        String path = "path/to/comments";
        List<String> commentLines = Arrays.asList("line 1\n", "line 2");
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        builder.setComment(path, commentLines);
        assertEquals(3, builder.getAllComments().size());
        assertEquals(2, builder.getAllComments().get(path).size());
    }

}