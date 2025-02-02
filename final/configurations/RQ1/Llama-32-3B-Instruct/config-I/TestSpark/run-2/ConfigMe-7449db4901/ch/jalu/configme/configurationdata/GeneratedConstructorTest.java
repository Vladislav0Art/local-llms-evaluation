package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertTrue(configuration.comments.isEmpty());
    }

}