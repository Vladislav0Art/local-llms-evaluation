package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.outline.Outline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedRunInternalOutlineTest {

    @Test
    public void runInternalOutlineTest() {
        Outline mockOutline = Mockito.mock(Outline.class);
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Assertions.assertThrows(Exception.class, () -> {
            plugin.runInternal(mockOutline);
        });
    }

}