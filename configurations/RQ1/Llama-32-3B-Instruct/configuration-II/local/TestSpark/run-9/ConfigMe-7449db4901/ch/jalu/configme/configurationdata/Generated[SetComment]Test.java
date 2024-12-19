package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generated[SetComment]

Test {

    @Test
    public void [SetComment]Test() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path1", "line1", "line2");
        assertNotNull(configuration.comments.get("path1"));
    }

}