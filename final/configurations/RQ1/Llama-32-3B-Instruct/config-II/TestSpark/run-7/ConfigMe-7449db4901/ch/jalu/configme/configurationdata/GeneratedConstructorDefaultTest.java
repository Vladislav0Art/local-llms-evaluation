package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.List;

public class GeneratedConstructorDefaultTest {

    @Test
    public void constructorDefaultTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertNotNull(config.comments);
        assertEquals(0, config.comments.size());
    }

}