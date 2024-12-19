package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentTests_emptyPath {

    @Test
    public void setCommentTests_emptyPath() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("", "line1");
        assertNotNull(config.getComments().get(""));
        assertEquals(1, config.getComments().get("").size());
    }

}