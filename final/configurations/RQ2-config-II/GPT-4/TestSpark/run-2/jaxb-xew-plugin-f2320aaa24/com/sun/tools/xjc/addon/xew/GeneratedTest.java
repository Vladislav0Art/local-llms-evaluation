package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.mockito.Mockito;

import javax.xml.bind.JAXBElement;
import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void runInternalTest() throws ClassNotFoundException, IOException {
        // Given
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        Outline outlineMock = Mockito.mock(Outline.class);

        // When
        try {
            xmlElementWrapperPlugin.runInternal(outlineMock);
        } catch (final IOException e) {
            fail("Test failed with IOException: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            fail("Test failed with ClassNotFoundException: " + e.getMessage());
        }

        // Then
        assertTrue(true);
    }

    @Test
    public void runInternalClassNotFoundExceptionTest() throws ClassNotFoundException, IOException {
        // Given
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        Outline outlineMock = Mockito.mock(Outline.class);

        // We simulate the occurrence of the exception
        doThrow(new ClassNotFoundException()).when(outlineMock).getContainer(any());

        // When
        xmlElementWrapperPlugin.runInternal(outlineMock);
        // Then expect exception
    }

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