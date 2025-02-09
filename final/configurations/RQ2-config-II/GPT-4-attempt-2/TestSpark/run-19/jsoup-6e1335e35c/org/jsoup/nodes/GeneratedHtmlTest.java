package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Collections;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        child.html("<div>test content</div>");
        assertEquals("<div>test content</div>", child.html());
        parent.appendChild(child);
        assertEquals("<child><div>test content</div></child>", parent.html());
    }

}