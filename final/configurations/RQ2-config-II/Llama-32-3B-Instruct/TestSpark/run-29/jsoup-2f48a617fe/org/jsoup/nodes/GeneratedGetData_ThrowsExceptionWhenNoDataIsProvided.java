package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetData_ThrowsExceptionWhenNoDataIsProvided {

    @Mock
    private Appendable accum;

    @Test
    public void getData_ThrowsExceptionWhenNoDataIsProvided() {
        assertThrows(NullPointerException.class, () -> comment.getData());
    }

}