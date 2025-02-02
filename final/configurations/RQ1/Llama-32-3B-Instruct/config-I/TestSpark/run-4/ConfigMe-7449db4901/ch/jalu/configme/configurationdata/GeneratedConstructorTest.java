package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        CommentsConfiguration comments = new CommentsConfiguration();
        assertNotNull(comments);
        assertTrue(comments.comments.isEmpty());
    }

}