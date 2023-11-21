public class AccessModifiers {
    public static void main(String[] args) {
        /*
                Types of Access Modifiers in Java
                There are four types of access modifiers available in Java:

                Default – No keyword required
                Private
                Protected
                Public

                1. Default Access Modifier
            When no access modifier is specified for a class, method, or data member – i
            t is said to be having the default access modifier by default. The data members, classes, or methods that are
            not declared using any access modifiers i.e. having default access modifiers are accessible only within the same package.

                2. Private Access Modifier
            The private access modifier is specified using the keyword private.
            The methods or data members declared as private are accessible only within the class in which they are declared.
            Any other class of the same package will not be able to access these members.
            Top-level classes or interfaces can not be declared as private because
            private means “only visible within the enclosing class”.
            protected means “only visible within the enclosing class and any subclasses”

                3. Protected Access Modifier
            The protected access modifier is specified using the keyword protected.
            The methods or data members declared as protected are accessible within the same package or subclasses in different packages.


                4.Public Access modifier
            The public access modifier is specified using the keyword public.
            The public access modifier has the widest scope among all other access modifiers.
            Classes, methods, or data members that are declared as public are accessible from everywhere
            in the program. There is no restriction on the scope of public data members.

        */
    }
}
