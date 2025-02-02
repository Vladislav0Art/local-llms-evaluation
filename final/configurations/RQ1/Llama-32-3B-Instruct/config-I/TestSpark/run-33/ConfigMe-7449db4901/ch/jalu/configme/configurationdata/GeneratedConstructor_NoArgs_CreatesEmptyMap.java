package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedConstructor_NoArgs_CreatesEmptyMap {

    @Test
    public void constructor_NoArgs_CreatesEmptyMap() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertEquals(0, config.comments.size());
    }

}