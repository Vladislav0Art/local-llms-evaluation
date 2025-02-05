package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch.jalu.configme.configurationdata.CommentsConfiguration;

public class GeneratedConstructorWithNoArgsTest {

    @Test
    public void constructorWithNoArgsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

}