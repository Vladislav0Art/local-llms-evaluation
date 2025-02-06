package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConstructorEmptyMapTest {

    @Test
    public void constructorEmptyMapTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertNotNull(config.getAllComments());
    }

}