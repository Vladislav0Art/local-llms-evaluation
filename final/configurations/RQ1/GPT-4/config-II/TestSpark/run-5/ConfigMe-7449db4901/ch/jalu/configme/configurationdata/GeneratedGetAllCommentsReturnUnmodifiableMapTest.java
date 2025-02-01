package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;

public class GeneratedGetAllCommentsReturnUnmodifiableMapTest {

    @Test
    public void getAllCommentsReturnUnmodifiableMapTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.getAllComments().put("path", Arrays.asList("comment"));
    }

}