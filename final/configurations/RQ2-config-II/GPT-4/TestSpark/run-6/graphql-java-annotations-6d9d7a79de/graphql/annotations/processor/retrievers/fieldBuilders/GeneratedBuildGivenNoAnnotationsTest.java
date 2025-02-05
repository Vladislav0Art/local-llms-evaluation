package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class GeneratedBuildGivenNoAnnotationsTest {

    @Test
    public void buildGivenNoAnnotationsTest() {
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        Field field = Mockito.mock(Field.class);

        DirectivesBuilder builder = new DirectivesBuilder(field, container);
        builder.build();
    }

}