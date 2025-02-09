package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedAddNullPropertyThrowsExceptionTest {

    @Test
    public void addNullPropertyThrowsExceptionTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        try {
            propertyListBuilder.add(null);
            fail("Exception should be thrown when adding null Property");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage(), e.getMessage().contains("Parameter specified as non-null is null"));
        }
    }

}