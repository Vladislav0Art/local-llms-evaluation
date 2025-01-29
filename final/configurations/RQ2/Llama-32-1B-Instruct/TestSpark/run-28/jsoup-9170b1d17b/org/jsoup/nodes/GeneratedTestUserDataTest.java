package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestUserDataTest {

    private Document doc = new Document();

    @Test
    public void testUserDataTest() {
        Attributes attributes = new Attributes();
        attributes.addUser("value");
        System.out.println(attributes.getUserData("value"));
    }

}