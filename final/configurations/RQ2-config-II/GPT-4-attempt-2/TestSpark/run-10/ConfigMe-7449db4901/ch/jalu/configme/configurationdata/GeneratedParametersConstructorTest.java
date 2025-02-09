package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedParametersConstructorTest {

    @Test
    public void parametersConstructorTest() {
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Arrays.asList("Line1", "Line2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(expectedComments);

        Map<String, List<String>> actualComments = commentsConfiguration.getAllComments();
        assertThat(actualComments.size(), is(expectedComments.size()));
        assertThat(actualComments, is(expectedComments));
    }

}