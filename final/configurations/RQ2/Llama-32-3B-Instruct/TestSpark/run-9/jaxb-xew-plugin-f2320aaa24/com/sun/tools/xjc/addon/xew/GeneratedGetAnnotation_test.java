package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAnnotation_test {

    @Mock
    private AbstractConfigurablePlugin configurablePlugin;

    @Spy
    private Options options;

    @InjectMocks
    private XmlElementWrapperPlugin xmlElementWrapperPlugin;

    @Test
    public void getAnnotation_test() {
        when(configurablePlugin.getAnnotation(Mockito.anyString())).thenReturn(true);
        assertTrue(xmlElementWrapperPlugin.getAnnotation("test"));
    }

}