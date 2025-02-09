package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedGetAllCommentsEmptyTest {

    @Test
    public void getAllCommentsEmptyTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertEquals(Collections.emptyMap(), configuration.getAllComments());
    }

}