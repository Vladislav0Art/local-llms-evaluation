package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedGetNotExistKeyTest {

    @Test
    public void getNotExistKeyTest() {
        Attributes attributes = new Attributes();
        attributes.get("not_exist_key");
    }

}