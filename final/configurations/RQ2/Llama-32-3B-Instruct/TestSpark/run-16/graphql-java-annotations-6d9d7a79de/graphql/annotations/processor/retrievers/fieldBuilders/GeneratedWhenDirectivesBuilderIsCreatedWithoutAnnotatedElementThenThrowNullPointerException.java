package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;

import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWhenDirectivesBuilderIsCreatedWithoutAnnotatedElementThenThrowNullPointerException {

    @InjectMocks
    private DirectivesBuilder directivesBuilder;

    @Mock
    private AnnotatedElement object;

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void whenDirectivesBuilderIsCreatedWithoutAnnotatedElementThenThrowNullPointerException() {
        // Given: Object is not annotated with GraphQLDirectives
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);

        // When/Then: Object is passed to DirectivesBuilder constructor, then it throws NullPointerException
        try {
            new DirectivesBuilder(object, container);
            assert false;
        } catch (NullPointerException e) {
            assert true;
        }
    }

}