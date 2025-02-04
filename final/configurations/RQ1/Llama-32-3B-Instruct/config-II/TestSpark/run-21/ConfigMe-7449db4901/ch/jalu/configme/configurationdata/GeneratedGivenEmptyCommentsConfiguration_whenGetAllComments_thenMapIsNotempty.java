package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGivenEmptyCommentsConfiguration_whenGetAllComments_thenMapIsNotempty {

    @Test
    public void givenEmptyCommentsConfiguration_whenGetAllComments_thenMapIsNotempty() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertTrue(configuration.getAllComments().size() > 0);
    }

}