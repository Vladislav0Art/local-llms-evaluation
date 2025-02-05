package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentMultipleLinesTest {

    @Test
    public void setCommentMultipleLinesTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "config.test";
        String[] comments = {"This is the first line of comment.", "This is the second line."};

        commentsConfiguration.setComment(path, comments);

        Map<String, List<String>> result = commentsConfiguration.getAllComments();

        assertEquals(1, result.size());
        assertEquals(Arrays.asList(comments), result.get(path));
    }

}