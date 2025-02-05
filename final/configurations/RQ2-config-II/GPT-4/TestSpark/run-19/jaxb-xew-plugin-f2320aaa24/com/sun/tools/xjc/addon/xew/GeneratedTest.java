package com.sun.tools.xjc.addon.xew;

import java.io.IOException;

import com.sun.tools.xjc.addon.xew.CommonUtils;
import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.model.CCustomizations;
import com.sun.tools.xjc.outline.Outline;
import com.sun.xml.xsom.XSComponent;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void runInternalValidOutlineTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline outline = mock(Outline.class);

        doNothing().when(outline).generateCode(any(CCustomizations.class), any(XSComponent.class));

        plugin.runInternal(outline);
    }

    @Test
    public void runInternalNullOutlineTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.runInternal(null);
    }

    @Test
    public void runInternalInvalidOutlineTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline outline = mock(Outline.class);

        doThrow(new ClassNotFoundException()).when(outline).generateCode(any(CCustomizations.class), any(XSComponent.class));

        plugin.runInternal(outline);
    }

    @Test
    public void runInternalIOExceptionTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline outline = mock(Outline.class);

        doThrow(new IOException()).when(outline).generateCode(any(CCustomizations.class), any(XSComponent.class));

        plugin.runInternal(outline);
    }

}