package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternal_ConfigurationPresent_NoException {

    @InjectMocks
    private XmlElementWrapperPlugin plugin;

    @Test
    public void runInternal_ConfigurationPresent_NoException() throws Exception {
        Outline outline = new Outline();
        ClassConfiguration config = new ClassConfiguration();
        plugin.setConfiguration(config);
        plugin.runInternal(outline);
    }

}