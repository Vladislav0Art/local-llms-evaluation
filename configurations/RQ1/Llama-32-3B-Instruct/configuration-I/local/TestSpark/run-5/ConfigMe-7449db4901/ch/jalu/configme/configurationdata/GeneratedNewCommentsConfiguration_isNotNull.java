package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_isNotNull {

    @Test
    public void newCommentsConfiguration_isNotNull() {
        CommentsConfiguration config = new CommentsConfiguration();
        assert null != config.comments;
    }

}