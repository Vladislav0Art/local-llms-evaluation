package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

public class GeneratedGivenNewCommentsConfiguration_whenCreated_thenNewMapIsReturned {

    @Test
    public void givenNewCommentsConfiguration_whenCreated_thenNewMapIsReturned() {
        CommentsConfiguration comments = new CommentsConfiguration();
        assertNotNull(comments.getComments());
    }

}