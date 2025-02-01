package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedCommentsConfigurationConstructorNoArgsTest {

    @Test
    public void commentsConfigurationConstructorNoArgsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue("Empty map expected", commentsConfiguration.getAllComments().isEmpty());
    }

}