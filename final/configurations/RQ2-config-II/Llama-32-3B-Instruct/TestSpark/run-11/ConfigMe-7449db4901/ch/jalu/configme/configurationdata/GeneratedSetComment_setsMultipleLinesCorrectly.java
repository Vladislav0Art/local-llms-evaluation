package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_setsMultipleLinesCorrectly {

    @Test
    public void setComment_setsMultipleLinesCorrectly() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String commentLines[] = {"comment1", "comment2"};
        commentsConfiguration.setComment("path", commentLines);
        assertTrue(commentsConfiguration.getAllComments().get("path").containsAll(Arrays.asList("comment1", "comment2")));
    }

}