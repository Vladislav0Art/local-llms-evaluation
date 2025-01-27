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
public class GeneratedCopyAnnotationMemberValue_test {

    @Mock
    private AbstractConfigurablePlugin configurablePlugin;

    @Spy
    private Options options;

    @InjectMocks
    private XmlElementWrapperPlugin xmlElementWrapperPlugin;

    @Test
    public void copyAnnotationMemberValue_test() {
        when(configurablePlugin.copyAnnotationMemberValue(Mockito.anyString(), Mockito.anyObject())).thenReturn("test");
        assertEquals("test", xmlElementWrapperPlugin.copyAnnotationMemberValue("test", true));
    }

}