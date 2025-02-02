package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class GeneratedConstructorTest {

    @Test
    public void ConstructorTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertNotNull(configuration.comments);
        assertTrue(configuration.comments.isEmpty());
    }

}