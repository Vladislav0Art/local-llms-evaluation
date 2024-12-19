package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GeneratedGetAllCommentsEmptyTest {

    @Test
    public void getAllCommentsEmptyTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertNull(configuration.getAllComments());
    }

}