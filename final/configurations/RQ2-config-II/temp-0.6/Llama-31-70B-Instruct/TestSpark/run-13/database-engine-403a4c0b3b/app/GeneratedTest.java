package app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    private DBApp dbApp;

    @BeforeEach
    @DisplayName("Initialize DBApp")
    void init() {
        dbApp = new DBApp();
    }

    @Test
    public void testInit() {
        HashSet<String> expectedTables = new HashSet<>();

        dbApp.init();

        assertEquals(expectedTables, dbApp.getMyTables());
    }

}