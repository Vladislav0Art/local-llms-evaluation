package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_singleLineNoMarker {

    @Test
    public void setComment_singleLineNoMarker() {
        CommentsConfiguration comments = new CommentsConfiguration();
        comments.setComment("path1", "");
        assertEquals(0, comments.getAllComments().get("path1").size());
    }

}