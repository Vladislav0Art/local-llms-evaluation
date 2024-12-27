package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedNewInstance_returnsNewInstance {

    @Test
    public void newInstance_returnsNewInstance() {
        XmlTreeBuilder instance1 = new XmlTreeBuilder();
        XmlTreeBuilder instance2 = instance1.newInstance();
        assertNotSame(instance1, instance2);
    }

}