package app;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert.*;

public class GeneratedGetReader_ThrowsException {

    @Test
    public void getReader_ThrowsException() {
        DBApp dbApp = new DBApp();
        try {
            dbApp.getReader();
            fail("Expected exception");
        } catch (Exception e) {
            assertThat(e, instanceOf(IOException.class));
        }
    }

}