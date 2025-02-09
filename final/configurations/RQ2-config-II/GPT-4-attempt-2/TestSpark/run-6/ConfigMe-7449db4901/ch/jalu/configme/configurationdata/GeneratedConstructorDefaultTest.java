package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class GeneratedConstructorDefaultTest {

    @Test
    public void constructorDefaultTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertEquals(Collections.emptyMap(), commentsConfiguration.getAllComments());
    }

}