package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedCreateEmptyPropertyListTest {

    @Test
    public void createEmptyPropertyListTest() {
        // Given
        PropertyListBuilder builder = new PropertyListBuilder();

        // When
        List<Property<?>> properties = builder.create();

        // Then
        assertThat(properties, is(new ArrayList<>()));
    }

}