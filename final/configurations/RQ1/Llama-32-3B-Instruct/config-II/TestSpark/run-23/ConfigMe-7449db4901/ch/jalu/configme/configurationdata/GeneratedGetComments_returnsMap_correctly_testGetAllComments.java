package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedGetComments_returnsMap_correctly_testGetAllComments {

    @Test
    public void getComments_returnsMap_correctly_testGetAllComments() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("commentPath", Arrays.asList("CommentedLine"));

        CommentsConfiguration commentsConfig = new CommentsConfiguration(commentsMap);

        assertNotNull(commentsConfig.getAllComments());
    }

}