package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import graphql.schema.GraphQLTypeBuilder;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

public class GeneratedTestDirectivesWithInvalidType {

    public static void main(String[] args) {
        AnnotatedElement object = TestDirectivesBuilder.class.getAnnotation(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        GraphQLDirective[] directives = builder.build();

        // Add assertion for each directive
        for (GraphQLDirective directive : directives) {
            // Use Mockito to mock the annotation's value and verify the result
            MockDirectivesBuilder mockBuilder = new MockDirectivesBuilder();
            mockBuilder.setArgument(0, DirectiveJavaAnnotationUtil.getMockedAnnotationValue(directive));
            assert mockBuilder.build().equals(directives);
        }
    }

    @Test
    public void testDirectivesWithInvalidType() {
        // Test the build method of DirectivesBuilder when a non-GraphQL type is present
        AnnotatedElement object = TestDirectiveWithoutType.class;
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        GraphQLDirective[] directives = builder.build();

        // Verify that the build method throws an exception with the correct error message
        assert GraphQLAnnotationsException.class.equals(directives[0].getClass());  // Add assertion for error
    }

}