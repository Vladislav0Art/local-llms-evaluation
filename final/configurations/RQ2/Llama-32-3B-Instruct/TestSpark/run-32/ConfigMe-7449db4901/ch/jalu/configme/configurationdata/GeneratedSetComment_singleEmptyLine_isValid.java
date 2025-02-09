package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedSetComment_singleEmptyLine_isValid {

    @Test
    public void setComment_singleEmptyLine_isValid() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration commentsConfig = new CommentsConfiguration(map);
        String[] commentLines = {""};
        commentsConfig.setComment("path", commentLines[0]);
        assertNotNull(commentsConfig.getAllComments());
        assertTrue(commentsConfig.getAllComments().isEmpty());
    }

}