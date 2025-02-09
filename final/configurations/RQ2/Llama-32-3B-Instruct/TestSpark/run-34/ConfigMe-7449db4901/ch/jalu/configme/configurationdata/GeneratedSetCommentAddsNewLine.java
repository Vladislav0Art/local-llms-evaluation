package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentAddsNewLine {

    @Test
    public void setCommentAddsNewLine() {
        var config = new CommentsConfiguration(Collections.emptyMap());
        config.setComment("path", "", "\n", "");
        assertEquals(Arrays.asList("", ""), config.getAllComments().get("path"));
    }

}