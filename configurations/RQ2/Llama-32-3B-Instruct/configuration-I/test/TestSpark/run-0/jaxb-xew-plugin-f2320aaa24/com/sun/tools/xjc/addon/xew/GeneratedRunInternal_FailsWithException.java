package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.io.OutputStreamWriter;

import org.mockito.InjectMocks;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternal_FailsWithException {

    @Mock
    private Outline outline;

    @Mock
    private OutputStreamWriter outputStreamWriter;

    @Spy
    private AbstractConfigurablePlugin configurablePlugin;

    @org.junit.Test
    public void runInternal_Succeeds() throws IOException, ClassNotFoundException {
        // Given
        configure();

        // When
        xmlElementWrapperPlugin.runInternal(outline);

        // Then
        org.mockito.Mockito.verify(outputStreamWriter).write();
    }

    @Test
    public void runInternal_FailsWithException() throws IOException, ClassNotFoundException {
        // Given
        configure();

        // When and Then
        when(outline).thenThrow(IOException.class);
        xmlElementWrapperPlugin.runInternal(outline);

        verifyNoMoreInteractions(outputStreamWriter);
    }

    private void configure() {
        when(outline).thenReturn(outputStreamWriter);
        doNothing().when(configurablePlugin).runInternal(any());
    }

}