package ch.jalu.configme.configurationdata;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;

public class GeneratedNewCommentsConfiguration_isEmpty {

    public static List<String> asList(String... strings) {
        return Arrays.asList(strings);
    }

    @Test
    public void newCommentsConfiguration_isEmpty() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertTrue(configuration.getAllComments().isEmpty());
    }

}