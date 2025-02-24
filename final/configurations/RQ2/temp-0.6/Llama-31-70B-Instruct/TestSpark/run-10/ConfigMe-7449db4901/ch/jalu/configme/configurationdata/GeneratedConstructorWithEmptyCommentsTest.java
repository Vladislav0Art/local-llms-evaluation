package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import ch.jalu.configme.SettingsHolder;

import static org.junit.Assert.*;

public class GeneratedConstructorWithEmptyCommentsTest {

    @Test
    public void constructorWithEmptyCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(Collections.emptyMap());
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

}