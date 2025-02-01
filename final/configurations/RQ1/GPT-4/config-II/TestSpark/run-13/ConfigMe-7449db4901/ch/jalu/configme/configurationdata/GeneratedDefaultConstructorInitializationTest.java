package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedDefaultConstructorInitializationTest {

    @Test
    public void defaultConstructorInitializationTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

}