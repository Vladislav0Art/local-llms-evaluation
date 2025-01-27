package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        // Given
        Property<?> property = Mockito.mock(Property.class);

        // When
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property);

        // Then
        assertThat(builder.getRootEntries(), is(new java.util.HashMap<>())); // temporary hack to avoid null pointer exception
    }

}