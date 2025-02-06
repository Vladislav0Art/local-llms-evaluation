package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.CommentsConfigurationBuilder;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentSetsAllLinesForPath {

    @Test
    public void setCommentSetsAllLinesForPath() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        CommentsConfiguration configuration = builder.build(comments).build();
        String path = "path";
        String[] commentLines = {"comment1", "comment2"};
        configuration.setComment(path, commentLines);
        assertEquals(Arrays.asList(commentLines), configuration.getAllComments().get(path));
    }

}