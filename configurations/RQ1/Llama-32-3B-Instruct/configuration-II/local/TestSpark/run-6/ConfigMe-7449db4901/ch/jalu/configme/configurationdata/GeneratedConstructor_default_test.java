package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedConstructor_default_test {

    @Test
    public void constructor_default_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertNotNull(config.comments);
        assertEquals(0, config.comments.size());
    }

}