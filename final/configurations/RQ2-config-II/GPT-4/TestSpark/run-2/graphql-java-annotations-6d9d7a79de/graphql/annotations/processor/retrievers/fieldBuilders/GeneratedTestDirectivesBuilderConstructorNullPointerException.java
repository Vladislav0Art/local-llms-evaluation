package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.Mock;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;

import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestDirectivesBuilderConstructorNullPointerException {

    @Mock
    private AnnotatedElement mockAnnotatedElement;

    @Mock
    private ProcessingElementsContainer mockContainer;

    @Test
    public void testDirectivesBuilderConstructorNullPointerException() {
        new DirectivesBuilder(null, mockContainer);
    }

}