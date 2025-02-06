package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedGetAllComments_noPaths {

    @Test
    public void getAllComments_noPaths() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertTrue(configuration.getAllComments().isEmpty());
    }

}