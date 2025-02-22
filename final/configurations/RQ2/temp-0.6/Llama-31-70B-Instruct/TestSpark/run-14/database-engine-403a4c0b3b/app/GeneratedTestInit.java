package app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class GeneratedTestInit {

    private DBApp dbApp;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        dbApp = new DBApp();
    }

    @Test
    public void testInit() {
        dbApp.init();
        HashSet<String> myTables = dbApp.getMyTables();
        assertNotNull(myTables);
    }

}