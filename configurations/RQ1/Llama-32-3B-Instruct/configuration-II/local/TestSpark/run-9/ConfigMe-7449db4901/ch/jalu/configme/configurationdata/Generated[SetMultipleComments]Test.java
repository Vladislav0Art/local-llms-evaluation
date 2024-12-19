package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generated[SetMultipleComments]

Test {

    @Test
    public void [SetMultipleComments]Test() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path1", "line11", "line12");
        configuration.setComment("path2", "line21", "line22");
        assertEquals(2, configuration.comments.size());
    }

}