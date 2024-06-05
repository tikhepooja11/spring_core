# spring_core

1. Maven project creation
2. Dependency injection
3. property injection using <property> and <value> tag
4. property injection using <property> value as attribute
5. property injection using p schema
6. Injecting collections - list, set, property, map
7. Standalone collections -> why to use ? -> If we wanted to use static collection such as list/map outside of multiple beans as their properties then to avoid repetation of creating again & again we will create       standalone list and will use multiple places in multiple beans
8. Constructor Injection
9. Resolving constructor ambiguity by passing argument type such as type="int", also argument index with index=2 or index="2"
10. Lifecycle methods (init(), destroy()) of spring bean and its implementation using xml, interface methods & by using annotation
      Making use of AbstractApplicationContext to registerShutdownHook in order to call destroy lifecycle method of bean
     Understanding lifecycle methods -> setting properties -> init() method -> destroy() method.
11. Autowiring vs manual wiring(referencing another bean by <ref> tag)
      Modes of autowiring ->
      1. XML   - 1. No mode, 2. byName, 3. byType, 4. Constructor
      2. Annotations -1. using @Autowired annotation
    @Autowired annotation works with byType mode i.e with class name not by bean name. So we can put any name to bean, but if there are multiple beans with same Type but diff names then to inject exact bean we have to use @Qualifier annotation.
12. @Qualifier annotation. -  but if there are multiple beans with same Type but diff names then to inject exact bean we have to use @Qualifier annotation.
13. Stereotype annotation-> @Component, @Value annotations also @Value with collections
14. Spring beans scope -> core application scopes of bean -> singleton & prototype but web apps scope of bean -> request, session & globalsession
      By default singleton scope exists -> this means if we request object to context again and again then it will return previously created object
      Prototype -> But for bigger apps this is not recommended to have only single object, for that we have specify scope of that bean as "prototype"
                  With xml -> in bean tag <bean scope="prototype">
                  with annotation -> @Scope("prototype") to Class whose obj to be created again.
15. SpEL -> Spring expression language -> spring parses and evalutes expression language with help of @Value annotation.
16. Invoking Predefined static methods, variables & creating objects using @Value annotation
