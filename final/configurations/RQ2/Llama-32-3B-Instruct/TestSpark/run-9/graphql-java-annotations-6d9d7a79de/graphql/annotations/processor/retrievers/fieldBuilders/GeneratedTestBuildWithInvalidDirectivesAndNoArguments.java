package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratedTestBuildWithInvalidDirectivesAndNoArguments {

    private AnnotatedElement object;
    private ProcessingElementsContainer container;

    @Before
    public void setUp() {
        object = new Object();
        container = new ProcessingElementsContainer();
    }

    @Test
    public void testBuildWithInvalidDirectivesAndNoArguments() throws Exception {
        GraphQLDirective[] directives = Arrays.asList(
                DirectiveJavaAnnotationUtil.newDirective("invalid")
        );
        DirectivesBuilder builder = getBuilder();
        builder.setObject(object);
        builder.setContainer(container);

        try {
            DirectivesBuilder.DirectivesBuilder directivesBuilder = builder;
            GraphQLDirective[] result = directivesBuilder.build().orElse(new ArrayList<>());
            Assert.fail("Expected GraphQLAnnotationsException to be thrown");
        } catch (GraphQLAnnotationsException e) {
            // Expected
        }
    }

}