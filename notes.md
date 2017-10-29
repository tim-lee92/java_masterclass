General notes:
* You must use `""` for `Strings`

Expressions vs statements:
* Statements are entire lines
* Expressions are something like `myVariable = 50;`

If/Else blocks:
* The `{}` are not needed if the code block is only one line
  * Cannot do multiline without `{}`
  * Subsequent lines will not be part of the statement and will be executed outside of the If/Else statement

Method overloading:
* Use of the same method name with different parameters
* "Unique method signature" can be unique name, or unique parameters needed by the method.

In `switch` statements: you need a `break;` in each case or else it will keep going falling into next case statements until a break is found. For instance, in the `default:` case, you do not need a `break;` if it's in the last line.
* With older versions of java, we can use switch with the primitive types: short, byte, char, and int
* Since Java 7, switch statements work with `String`s

`do` or do-while will execute a block at least once.
* Syntax: `do {} while {};`

A `class` is a blueprint for an object.

Class constructors go by the syntax `public [className]`, you don't need the keyword to state what datatype it is going to return.
* Recall method overloading, which can be done with constructors.
* You can call another constructor within another constructor.
  * Must be the very first line.
* Using `super` must be used explicitly to call the super class method if you have an `@Override` in the current class.

Compositions deal with a "has a" relationship.
