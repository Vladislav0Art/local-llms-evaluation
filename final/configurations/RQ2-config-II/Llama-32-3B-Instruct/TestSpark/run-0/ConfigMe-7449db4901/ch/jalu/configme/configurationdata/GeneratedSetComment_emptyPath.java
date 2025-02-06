package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetComment_emptyPath {

    @Test
    public void setComment_emptyPath() {
        CommentsConfiguration comments = new CommentsConfiguration();
        try {
            comments.setComment("", "line1");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

}