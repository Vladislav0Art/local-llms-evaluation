package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlTailTest {

    @Mock
    private Appendable appendableMock;

    @Mock
    private Document.OutputSettings outputSettingsMock;

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("data");
        comment.outerHtmlTail(appendableMock, 0, outputSettingsMock);

        verify(appendableMock, never()).append(anyString());
    }

}