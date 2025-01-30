package ch.jalu.configme.configurationdata;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Assert.assertNotNull(commentsConfiguration.getAllComments());
        Assert.assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

}