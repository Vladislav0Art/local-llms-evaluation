package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.addon.xew.config.CommonConfiguration;
import com.sun.tools.xjc.outline.Outline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedRunInternalOutlineWithConfigTest {

    @Test
    public void runInternalOutlineWithConfigTest() {
        Outline mockOutline = Mockito.mock(Outline.class);
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        CommonConfiguration commonConfiguration = new CommonConfiguration();
        commonConfiguration.setForceWrapper(true);
        plugin.setConfiguration(commonConfiguration);
        Assertions.assertDoesNotThrow(() -> {
            plugin.runInternal(mockOutline);
        });
    }

}