package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        String path1 = "path1";
        List<String> commentLines1 = Arrays.asList("line1#", "line2");
        String path2 = "path2";
        List<String> commentLines2 = Arrays.asList("line3", "#", "line4");
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        commentsConfiguration.setComments(path1, 0, "#", 1);
        commentsConfiguration.setComments(path2, 0, "", 2);
        assertEquals(commentsMap, commentsConfiguration.getComments());
    }

}