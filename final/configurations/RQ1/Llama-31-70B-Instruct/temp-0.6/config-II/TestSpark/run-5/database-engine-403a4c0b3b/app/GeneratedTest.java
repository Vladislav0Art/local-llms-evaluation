package app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    private DBApp dbApp;

    @BeforeEach
    public void setUp() {
        dbApp = new DBApp();
    }

    @Test
    public void testGetMyTables() {
        assertNotNull(dbApp.getMyTables());
        assertFalse(dbApp.getMyTables().isEmpty());
    }

    @Test
    public void testGetReader() {
        assertNotNull(dbApp.getReader());
    }

    @Test
    public void testGetWriter() {
        assertNotNull(dbApp.getWriter());
    }

}