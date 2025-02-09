package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.jsoup.nodes.Attributes.*;

public class GeneratedCheckUserObjectCanInsertAndFetchTest {

    @Test
    public void checkUserObjectCanInsertAndFetchTest() {
        Attributes attributes = new Attributes();
        String userDataKey = "userKey";
        Object valueToInsert = new Integer(1);
        attributes.putUserData(userDataKey, valueToInsert);
        assertEquals(valueToInsert, attributes.getUserData(userDataKey));
    }

}