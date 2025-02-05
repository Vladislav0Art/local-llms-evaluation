package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedConstructorWithCommentsTest {

    @Test
    public void constructorWithCommentsTest() {
        Map<String, List<String>> inputComments = new HashMap<>();
        inputComments.put("path1", Arrays.asList("line1", "line2"));
        inputComments.put("path2", Arrays.asList("line3", "line4"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(inputComments);
        Assert.assertEquals(inputComments, commentsConfiguration.getAllComments());
    }

}