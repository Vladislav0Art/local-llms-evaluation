package ch.jalu.configme.configurationdata;

import org.junit.Test;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedDefaultConstructorTest {

    @Test
    public void defaultConstructorTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertTrue(configuration.getAllComments().isEmpty());
    }

}