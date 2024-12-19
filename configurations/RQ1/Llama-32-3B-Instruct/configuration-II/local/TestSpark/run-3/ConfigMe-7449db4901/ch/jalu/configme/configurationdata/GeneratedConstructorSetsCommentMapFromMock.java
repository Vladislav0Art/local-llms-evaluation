package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructorSetsCommentMapFromMock {

    @Mock
    private SettingsHolder settingsHolderMock;

    public List<String> getMockComments() {
        return new ArrayList<>();
    }

    @Test
    public void constructorSetsCommentMapFromMock() {
        CommentsConfiguration comments = new CommentsConfiguration(getMockComments());
        Mockito.when(settingsHolderMock.registerComments()).thenReturn(null);
        assertNotNull(comments);
        assertTrue(comments.getComments().contains(getMockComments()));
    }

}