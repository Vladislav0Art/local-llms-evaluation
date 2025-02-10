package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mockito;

public class GeneratedAddPropertyToListWithException {

    @Test
    public void addPropertyToListWithException() {
        List<Property<?>> list = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        try {
            builder.add(Mockito.mock(Property.class));
            assert false;
        } catch (ConfigMeException e) {
            assertThat(e.getMessage(), is("Failed to add property"));
        }
    }

}