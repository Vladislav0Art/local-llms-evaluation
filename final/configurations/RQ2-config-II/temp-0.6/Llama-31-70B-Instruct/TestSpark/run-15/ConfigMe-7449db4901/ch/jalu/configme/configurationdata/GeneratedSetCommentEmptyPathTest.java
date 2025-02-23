package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentEmptyPathTest {

    CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void setCommentEmptyPathTest() {
        List<String> commentLines = Arrays.asList("line1", "line2");
        Assertions.assertThrows(IllegalArgumentException.class, () -> commentsConfiguration.setComment("", commentLines.toArray(new String[0])));
    }

}