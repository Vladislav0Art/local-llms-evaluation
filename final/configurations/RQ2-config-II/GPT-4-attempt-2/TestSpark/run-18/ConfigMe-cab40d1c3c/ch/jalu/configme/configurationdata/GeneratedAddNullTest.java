package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class GeneratedAddNullTest {

    @Test
    public void addNullTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        try {
            propertyListBuilder.add(null);
            fail("Expected exception to be thrown");
        } catch (ConfigMeException ex) {
            assertThat(ex.getMessage(), is("Property may not be null"));
        }
    }

}