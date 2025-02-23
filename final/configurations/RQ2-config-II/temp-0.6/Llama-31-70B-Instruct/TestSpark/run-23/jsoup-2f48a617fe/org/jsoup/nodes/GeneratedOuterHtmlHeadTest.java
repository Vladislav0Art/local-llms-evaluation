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
public class GeneratedOuterHtmlHeadTest {

    @Mock
    private Appendable appendableMock;

    @Mock
    private Document.OutputSettings outputSettingsMock;

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("data");
        comment.outerHtmlHead(appendableMock, 0, outputSettingsMock);

        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(appendableMock, times(3)).append(captor.capture());

        String[] expectedStrings = new String[]{"<!--", "data", "-->"};
        String[] actualStrings = captor.getAllValues().toArray(new String[0]);

        assertArrayEquals(expectedStrings, actualStrings);
    }

}