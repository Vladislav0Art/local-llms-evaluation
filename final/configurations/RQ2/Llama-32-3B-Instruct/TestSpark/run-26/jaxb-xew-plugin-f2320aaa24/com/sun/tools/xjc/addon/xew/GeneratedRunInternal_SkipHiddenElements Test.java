package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GeneratedRunInternal_SkipHiddenElements Test {

    @Test
    public void runInternal_SkipHiddenElements

    Test() throws ClassNotFoundException, IOException {
        // Arrange and Act
        Options options = new Options();
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.runInternal(options);

        // Assert
        assertTrue(options.isSkipHiddenElements());
    }

}