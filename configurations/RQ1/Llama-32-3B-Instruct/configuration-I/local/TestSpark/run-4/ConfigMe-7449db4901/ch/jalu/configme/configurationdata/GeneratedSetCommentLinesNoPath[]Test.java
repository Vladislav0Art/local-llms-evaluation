package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedSetCommentLinesNoPath[]

Test {

    @Test
    public void setCommentLinesNoPath[] Test() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertThrows(IndexOutOfBoundsException.class, () -> config.setComment(null, "line1", "line2"));
    }

}