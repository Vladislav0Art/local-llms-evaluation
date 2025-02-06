package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetData_SettingData {

    @Mock
    private Appendable accum;

    @Test
    public void setData_SettingData() {
        when(comment.setData(anyString())).thenReturn(comment);
        assertEquals(comment, comment.setData("data"));
    }

}