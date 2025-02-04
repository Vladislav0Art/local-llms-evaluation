package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedGetAllComments_test_NullMap {

    @Test
    public void getAllComments_test_NullMap() {
        assertThrows(NullPointerException.class, () -> new CommentsConfiguration(null).getAllComments());
    }

}