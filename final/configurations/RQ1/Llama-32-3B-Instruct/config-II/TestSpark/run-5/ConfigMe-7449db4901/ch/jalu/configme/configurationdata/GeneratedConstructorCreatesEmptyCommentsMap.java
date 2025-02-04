package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GeneratedConstructorCreatesEmptyCommentsMap {

    @Test
    public void constructorCreatesEmptyCommentsMap() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertNotNull(configuration.getComments());
        assertEquals(0, configuration.getComments().size());
    }

}