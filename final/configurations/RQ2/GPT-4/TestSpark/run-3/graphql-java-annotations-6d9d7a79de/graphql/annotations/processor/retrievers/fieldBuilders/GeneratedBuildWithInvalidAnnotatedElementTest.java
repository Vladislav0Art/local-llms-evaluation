package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class GeneratedBuildWithInvalidAnnotatedElementTest {

    @Test
    public void buildWithInvalidAnnotatedElementTest() {
        // Setup
        Field field = Mockito.mock(Field.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(field, container);
        Mockito.doThrow(new GraphQLAnnotationsException("")).when(field).getAnnotations();

        // Run the test
        directivesBuilder.build();

        // Expect an exception to be thrown
    }

}