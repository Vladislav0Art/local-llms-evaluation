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

public class GeneratedDefaultConstructorTest {

    @Test
    public void defaultConstructorTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        assertThat(commentsConfiguration.getAllComments().size(), is(0));
    }

}