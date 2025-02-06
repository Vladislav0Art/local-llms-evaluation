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

public class GeneratedSetCommentSetsMultiplePaths {

    @Test
    public void setCommentSetsMultiplePaths() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfigurationBuilder builder = new CommentsConfigurationBuilder();
        CommentsConfiguration configuration = builder.build(comments).build();
        String path1 = "path1";
        String[] commentLines1 = {"comment11", "comment12"};
        String path2 = "path2";
        String[] commentLines2 = {"comment21", "comment22"};
        configuration.setComment(path1, commentLines1);
        configuration.setComment(path2, commentLines2);
        assertEquals(Arrays.asList(commentLines1), configuration.getAllComments().get(path1));
        assertEquals(Arrays.asList(commentLines2), configuration.getAllComments().get(path2));
    }

}