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
public class GeneratedWhenDirectivesBuilderBuildMethodIsCalledWithoutValidAnnotatedElementThenThrowGraphQLAnnotationsException {

    @InjectMocks
    private DirectivesBuilder directivesBuilder;

    @Mock
    private AnnotatedElement object;

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void whenDirectivesBuilderBuildMethodIsCalledWithoutValidAnnotatedElementThenThrowGraphQLAnnotationsException() {
        // Given: Object is not annotated with GraphQLDirectives
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);

        // When/Then: build method returns invalid directive array, then it throws NullPointerException
        try {
            directivesBuilder.build();
            assert false;
        } catch (GraphQLAnnotationsException e) {
            assert true;
        }
    }

}