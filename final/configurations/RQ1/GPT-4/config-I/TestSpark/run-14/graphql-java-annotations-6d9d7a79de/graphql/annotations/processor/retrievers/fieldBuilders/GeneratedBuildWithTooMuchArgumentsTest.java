package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static graphql.schema.GraphQLArgument.newArgument;
import static graphql.schema.GraphQLDirective.newDirective;
import static graphql.schema.GraphQLScalarType.newScalar;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildWithTooMuchArgumentsTest {

    @Test
    public void buildWithTooMuchArgumentsTest() {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        GraphQLDirective directive = newDirective()
                .name("directive")
                .argument(newArgument().name("arg").type(newScalar().name("scalar").coercing(new GraphQLScalarType.ScalarCoercing() {
                    @Override
                    public Object serialize(Object input) {
                        return null;
                    }

                    @Override
                    public Object parseValue(Object input) {
                        return null;
                    }

                    @Override
                    public Object parseLiteral(Object input) {
                        return null;
                    }
                }).build()).build())
                .build();
        when(container.getDirectiveRegistry()).thenReturn(Collections.singletonMap("directive", new GraphQLDirectiveContainer(directive)));

        DirectiveGraphQLDirective annotation = new DirectiveGraphQLDirective() {
            @Override
            public Class<? extends Annotation> annotationType() {
                return DirectiveGraphQLDirective.class;
            }

            @Override
            public String name() {
                return "directive";
            }

            @Override
            public String[] argumentsValues() {
                return new String[]{"value1", "value2"};
            }
        };
        when(object.getAnnotations()).thenReturn(new Annotation[]{annotation});

        try {
            DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
            directivesBuilder.build();
            fail("Exception was expected");
        } catch (Exception e) {
            assertEquals("Directive 'directive' is supplied with more argument values than it supports", e.getMessage());
        }
    }

}