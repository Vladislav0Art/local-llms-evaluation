package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCommentWithEmptyLineTest {

    @Test
    public void setCommentWithEmptyLineTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        String path = "config.path";
        String[] commentLines = {"", "This is a comment after an empty line"};

        commentsConfiguration.setComment(path, commentLines);

        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put(path, Arrays.asList(commentLines));

        assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

}