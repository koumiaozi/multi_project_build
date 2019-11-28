package greeter

import groovy.transform.*


@CompileStatic
class GreetingFormatter {
    static String greeting(final String name) {
        "Hello, ${name.capitalize()}"
    }
}