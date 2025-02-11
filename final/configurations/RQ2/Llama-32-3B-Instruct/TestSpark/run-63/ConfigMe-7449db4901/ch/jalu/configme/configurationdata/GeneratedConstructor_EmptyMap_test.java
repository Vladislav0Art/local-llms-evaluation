package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class GeneratedConstructor_EmptyMap_test {

    @Test
    public void constructor_EmptyMap_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertNotNull(config.getAllComments());
        assertEquals(Collections.emptyMap(), config.getAllComments());
    }

}