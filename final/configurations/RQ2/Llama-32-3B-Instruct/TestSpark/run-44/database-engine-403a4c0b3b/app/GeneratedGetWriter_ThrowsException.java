package app;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert.*;

public class GeneratedGetWriter_ThrowsException {

    @Test
    public void getWriter_ThrowsException() {
        DBApp dbApp = new DBApp();
        try {
            dbApp.getWriter();
            fail("Expected exception");
        } catch (Exception e) {
            assertThat(e, instanceOf(IOException.class));
        }
    }

}