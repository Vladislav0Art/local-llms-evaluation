package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSetCommentNullPathTest {

    @Test
    public void setCommentNullPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        try {
            commentsConfiguration.setComment(null, "comment1");
            fail("Expected an NullPointerException to be thrown");
        } catch (NullPointerException e) {
            // Test passed
        }
    }

}