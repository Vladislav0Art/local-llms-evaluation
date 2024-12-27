package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternal_ThrowsClassNotFoundExceptionWhenClassNotFinds {

    @Mock
    private Outline outlineMock;

    public XmlElementWrapperPluginTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void runInternal_ThrowsClassNotFoundExceptionWhenClassNotFinds() throws Exception, ClassNotFoundException {
        when(outlineMock.toString()).thenReturn("com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin");
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        try {
            plugin.runInternal(outlineMock);
            assertEquals("ClassNotFoundException", "Error finding class", Mockito.anyString());
        } catch (ClassNotFoundException e) {
            assertEquals(e.getMessage(), "Error finding class");
        }
    }

}