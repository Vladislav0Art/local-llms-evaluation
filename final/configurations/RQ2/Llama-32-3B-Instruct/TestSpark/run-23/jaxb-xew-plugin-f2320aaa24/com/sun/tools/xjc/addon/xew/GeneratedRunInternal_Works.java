package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedRunInternal_Works {

    @Test
    public void runInternal_Works() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline outline = new Outline();
        plugin.runInternal(outline);
    }

}