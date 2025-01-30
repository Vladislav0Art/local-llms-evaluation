package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.AnnotatedElement;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuildNoDirectiveFoundInRegistryTest {

    @Test
    public void buildNoDirectiveFoundInRegistryTest() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);

        Mockito.when(container.getDirectiveRegistry()).thenReturn(new HashMap<>());

        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        builder.build();
    }

}