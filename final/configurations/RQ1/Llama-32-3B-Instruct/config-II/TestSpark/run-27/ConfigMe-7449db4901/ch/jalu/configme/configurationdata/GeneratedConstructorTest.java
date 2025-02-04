package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertNotNull(config.comments);
        assertTrue(config.comments.isEmpty());
    }

}