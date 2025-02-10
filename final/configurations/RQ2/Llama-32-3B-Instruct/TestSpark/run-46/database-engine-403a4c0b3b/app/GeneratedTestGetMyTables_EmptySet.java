package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetMyTables_EmptySet {

    @Mock
    private Serializer serializer;

    @InjectMocks
    private DBApp dbApp;

    @Test
    public void testGetMyTables_EmptySet() {
        assertTrue(dbApp.getMyTables().isEmpty());
    }

}