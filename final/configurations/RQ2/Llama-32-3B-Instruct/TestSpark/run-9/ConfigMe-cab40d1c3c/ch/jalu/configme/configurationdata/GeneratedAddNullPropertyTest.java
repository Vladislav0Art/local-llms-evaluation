package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedAddNullPropertyTest {

    @Test
    public void addNullPropertyTest() {
        // Given
        Property<?> property = null;

        // When
        PropertyListBuilder builder = new PropertyListBuilder();

        // Then
        try {
            builder.add(property);
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
            assertThat(e.getMessage(), is("Property cannot be null"));
        }
    }

}