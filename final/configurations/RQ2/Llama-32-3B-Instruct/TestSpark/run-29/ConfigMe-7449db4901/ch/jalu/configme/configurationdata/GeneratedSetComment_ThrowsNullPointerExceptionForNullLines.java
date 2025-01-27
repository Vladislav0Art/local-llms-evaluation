package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetComment_ThrowsNullPointerExceptionForNullLines {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void setComment_ThrowsNullPointerExceptionForNullLines() {
        String path = "path";
        CommentsConfiguration commentConfiguration = new CommentsConfiguration();
        Mockito.when(settingsHolder.getComments()).thenReturn(Collections.emptyMap());
        assertThrows(NullPointerException.class, () -> commentConfiguration.setComment(path, null));
    }

}