package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedAdd_nonePropertyExceptionTest {

    @Test
    public void add_nonePropertyExceptionTest() {
        try {
            new PropertyListBuilder().add(null);
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
            // Expected
        }
    }

}