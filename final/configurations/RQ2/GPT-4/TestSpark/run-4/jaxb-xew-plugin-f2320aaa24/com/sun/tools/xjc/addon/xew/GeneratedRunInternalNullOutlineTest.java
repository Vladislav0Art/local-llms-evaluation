package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.outline.Outline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedRunInternalNullOutlineTest {

    @Test
    public void runInternalNullOutlineTest() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Assertions.assertThrows(NullPointerException.class, () -> {
            plugin.runInternal(null);
        });
    }

}