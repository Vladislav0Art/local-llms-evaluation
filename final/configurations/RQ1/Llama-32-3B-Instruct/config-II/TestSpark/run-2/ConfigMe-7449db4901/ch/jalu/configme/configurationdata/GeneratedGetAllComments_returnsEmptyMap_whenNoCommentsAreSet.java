package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedGetAllComments_returnsEmptyMap_whenNoCommentsAreSet {

    @Test
    public void getAllComments_returnsEmptyMap_whenNoCommentsAreSet() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertEquals(Collections.emptyMap(), config.getAllComments());
    }

}