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
public class GeneratedIsHiddenClass_test {

    @Mock
    private AbstractConfigurablePlugin configurablePlugin;

    @Spy
    private Options options;

    @InjectMocks
    private XmlElementWrapperPlugin xmlElementWrapperPlugin;

    @Test
    public void isHiddenClass_test() {
        when(configurablePlugin.isHiddenClass(Mockito.anyString())).thenReturn(false);
        assertFalse(xmlElementWrapperPlugin.isHiddenClass("test"));
    }

}