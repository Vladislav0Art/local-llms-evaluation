package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_NoLinesTest {

    @Test
    public void setComment_NoLinesTest() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "";
        String[] commentLines = {};
        commentsConfig.setComment(path, commentLines);
        assertNotNull(commentsConfig);
        assertEquals(1, commentsConfig.getAllComments().size());
    }

}