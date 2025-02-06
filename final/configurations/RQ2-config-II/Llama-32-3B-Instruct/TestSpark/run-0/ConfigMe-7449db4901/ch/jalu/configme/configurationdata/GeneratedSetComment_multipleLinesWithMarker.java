package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_multipleLinesWithMarker {

    @Test
    public void setComment_multipleLinesWithMarker() {
        CommentsConfiguration comments = new CommentsConfiguration();
        comments.setComment("path1", "#line1\n#line2\n#line3");
        assertEquals(Arrays.asList("#line1", "#line2", "#line3"), comments.getAllComments().get("path1"));
    }

}