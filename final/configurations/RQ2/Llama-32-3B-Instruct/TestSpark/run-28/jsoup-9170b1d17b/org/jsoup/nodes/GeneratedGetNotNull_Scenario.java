package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedGetNotNull_Scenario {

    @Test
    public void getNotNull_Scenario() {
        Attributes attrs = new Attributes();
        assertEquals("key", Attributes.checkNotNull(null));
    }

}