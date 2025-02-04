package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedGetAllComments_test {

    @Test
    public void getAllComments_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertEquals(config.getAllComments(), Collections.emptyMap());
    }

}