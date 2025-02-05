package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.mockito.Mockito;

import javax.xml.bind.JAXBElement;
import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedRunInternalIOExceptionTest {

    @Test
    public void runInternalIOExceptionTest() throws ClassNotFoundException, IOException {
        // Given
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        Outline outlineMock = Mockito.mock(Outline.class);

        // We simulate the occurrence of the exception
        doThrow(new IOException()).when(outlineMock).getContainer(any());

        // When
        xmlElementWrapperPlugin.runInternal(outlineMock);
        // Then expect exception
    }

}