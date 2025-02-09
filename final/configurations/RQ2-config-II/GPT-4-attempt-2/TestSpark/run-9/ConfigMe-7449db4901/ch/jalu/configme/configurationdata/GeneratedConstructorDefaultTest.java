package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedConstructorDefaultTest {

    @Test
    public void constructorDefaultTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertThat(commentsConfiguration.getAllComments().isEmpty(), is(true));
    }

}