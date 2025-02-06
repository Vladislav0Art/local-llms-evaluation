package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetCommentNewLinesOnlyTest {

    @Test
    public void setCommentNewLinesOnlyTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "", "", "");
        assertNotNull(config.getAllComments().get("path"));
        assertTrue(config.getAllComments().get("path").isEmpty());
    }

}