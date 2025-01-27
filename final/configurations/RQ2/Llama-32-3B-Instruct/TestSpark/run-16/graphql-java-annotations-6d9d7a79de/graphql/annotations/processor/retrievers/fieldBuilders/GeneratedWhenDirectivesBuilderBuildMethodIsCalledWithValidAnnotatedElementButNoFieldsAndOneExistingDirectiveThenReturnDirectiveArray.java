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
public class GeneratedWhenDirectivesBuilderBuildMethodIsCalledWithValidAnnotatedElementButNoFieldsAndOneExistingDirectiveThenReturnDirectiveArray {

    @InjectMocks
    private DirectivesBuilder directivesBuilder;

    @Mock
    private AnnotatedElement object;

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void whenDirectivesBuilderBuildMethodIsCalledWithValidAnnotatedElementButNoFieldsAndOneExistingDirectiveThenReturnDirectiveArray() {
        // Given: Object is annotated with GraphQLDirectives and has no fields
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        List<GraphQLDirectives> directivesListMock = new ArrayList<>();
        ((java.lang.reflect.AnnotatedElement) object).getAnnotation(GraphQLDirectives.class).directives().addAll(directivesListMock);

        // Given: one existing directive
        GraphQLDirective existingDirectiveMock = Mockito.mock(GraphQLDirective.class);

        // When: build method is called
        GraphQLDirective[] result = directivesBuilder.build();

        // Then: return directive array with existing directive
        assertArrayEquals(new GraphQLDirective[]{existingDirectiveMock}, result);
    }

}