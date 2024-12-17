package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class GeneratedGivenNullLines_whenSet_thenNullPointerExceptionIsThrown {

    @Test
    public void givenNullLines_whenSet_thenNullPointerExceptionIsThrown() {
        CommentsConfiguration comments = new CommentsConfiguration();
        comments.setComment("key1", null);
        assertThrows(NullPointerException.class, () -> comments.setComment("key1", "line"));
    }

}