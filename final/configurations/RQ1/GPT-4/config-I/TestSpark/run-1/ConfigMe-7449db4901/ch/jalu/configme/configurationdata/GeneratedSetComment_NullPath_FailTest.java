package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSetComment_NullPath_FailTest {

    @Test
    public void setComment_NullPath_FailTest() {
        String comment = "The single comment line";

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        try {
            commentsConfiguration.setComment(null, comment);
            fail("Should have thrown a NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}