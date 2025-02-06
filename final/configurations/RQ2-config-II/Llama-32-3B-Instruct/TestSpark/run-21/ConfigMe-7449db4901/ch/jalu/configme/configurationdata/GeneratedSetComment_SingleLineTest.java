package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_SingleLineTest {

    @Test
    public void setComment_SingleLineTest() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("key", Arrays.asList("value1"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        String path = "";
        String[] commentLines = {"line"};
        commentsConfig.setComment(path, commentLines);
        assertNotNull(commentsConfig);
        assertEquals(1, commentsConfig.getAllComments().size());
    }

}