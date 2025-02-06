package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_setsCorrectAllPaths {

    @Test
    public void setComment_setsCorrectAllPaths() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String commentLines[] = {"comment6"};
        commentsConfiguration.setComment("path1", commentLines);
        assertTrue(commentsConfiguration.getAllComments().containsKey("path1"));
    }

}