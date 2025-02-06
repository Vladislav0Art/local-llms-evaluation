package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateShell_NoBaseUri_throwsException {

    @Test
    public void createShell_NoBaseUri_throwsException() {
        // Arrange & Act & Assert
        assertThrows(Exception.class, () -> Document.createShell(null));
    }

}