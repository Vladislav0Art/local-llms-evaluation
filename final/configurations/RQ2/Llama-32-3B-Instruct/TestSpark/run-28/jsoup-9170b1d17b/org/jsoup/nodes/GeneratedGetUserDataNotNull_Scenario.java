package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedGetUserDataNotNull_Scenario {

    @Test
    public void getUserDataNotNull_Scenario() {
        Attributes attrs = new Attributes();
        attrs.putUserData("key", "value");
        assertNotNull(attrs.getUserData("key"));
    }

}