package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedSetComment_multipleComment_lines_isValid {

    @Test
    public void setComment_multipleComment_lines_isValid() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        String[] commentLines = {"comment1", "comment2"};
        commentsConfig.setComment("path", commentLines[0]);
        assertNotNull(commentsConfig.getAllComments());
        assertEquals(1, commentsConfig.getAllComments().size());
    }

}