package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;

public class GeneratedConstructorWithoutParamsInitializesEmptyCommentMapTest {

    @Test
    public void constructorWithoutParamsInitializesEmptyCommentMapTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertEquals(0, config.getAllComments().size());
    }

}