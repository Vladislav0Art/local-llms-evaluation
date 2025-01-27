package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedRunInternal_NoCustomizations_EmptyOutline {

    @Test
    public void runInternal_NoCustomizations_EmptyOutline() throws ClassNotFoundException, IOException {
        // Arrange and Act
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.runInternal(null);

        // Assert
        assertTrue(plugin.getCustomizationUtils().getCustomizations().isEmpty());
    }

}