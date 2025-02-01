package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedDefaultConstructorCreationTest {

    @Test
    public void defaultConstructorCreationTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue("Default constructor should create an empty map",
                commentsConfiguration.getAllComments().isEmpty());
    }

}