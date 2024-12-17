package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class GeneratedGivenNullPath_whenSet_thenNullPointerExceptionIsThrown {

    @Test
    public void givenNullPath_whenSet_thenNullPointerExceptionIsThrown() {
        CommentsConfiguration comments = new CommentsConfiguration();
        assertThrows(NullPointerException.class, () -> comments.setComment(null, "line"));
    }

}