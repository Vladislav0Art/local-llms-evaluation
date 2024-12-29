package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GeneratedTestBuildMethod_annotatedField_MultipleTypes_MultipleArguments_MultipleTypes_undefinedArgument {

    @Test
    public void testBuildMethod_annotatedField_MultipleTypes_MultipleArguments_MultipleTypes_undefinedArgument() {
        // Arrange
        AnnotatedElement object = null; // replace with actual object to use in build method
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        // Act
        GraphQLDirective[] directives = DirectivesBuilder.build(object, container);

        // Assert
        assert Arrays.asList(directives).contains(newDirective("test", GraphQLDirectives.Type.FIELD_TYPE)); // replace with actual test directive to use
    }

}