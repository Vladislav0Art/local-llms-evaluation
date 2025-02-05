package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.mockito.Mockito;

import javax.xml.bind.JAXBElement;
import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedRunInternalTest {

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

}