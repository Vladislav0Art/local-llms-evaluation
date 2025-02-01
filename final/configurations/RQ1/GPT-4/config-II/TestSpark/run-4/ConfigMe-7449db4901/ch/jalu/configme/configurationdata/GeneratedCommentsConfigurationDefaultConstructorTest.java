package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCommentsConfigurationDefaultConstructorTest {

    @Test
    public void commentsConfigurationDefaultConstructorTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

}