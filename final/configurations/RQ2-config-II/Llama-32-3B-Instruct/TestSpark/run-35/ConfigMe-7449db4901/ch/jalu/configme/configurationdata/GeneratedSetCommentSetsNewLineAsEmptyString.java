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

public class GeneratedSetCommentSetsNewLineAsEmptyString {

    @Test
    public void setCommentSetsNewLineAsEmptyString() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        CommentsConfiguration configuration = builder.build(comments).build();
        String path = "path";
        String[] commentLines = {"comment1", "", "comment3"};
        configuration.setComment(path, commentLines);
        assertEquals(Collections.singletonList(commentLines[0]), configuration.getAllComments().get(path));
    }

}