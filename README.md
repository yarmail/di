### Concept  DI - Dependency Injection
В крупных проектах могут быть классы, которые имеют много зависимостей.
Чтобы упростить создание такие объектов, программисты придумали 
концепцию "внедрение зависимостей" с английского DI - dependency injection.

Давайте мы сделаем свою реализацию DI.
Для реализации DI используется два подхода: 
мета программирование, рефлексия.

В этом примере мы будем использовать рефлексию. 
Рефлексия позволяет узнать какие элементы имеет 
класс в процессе выполнения программы.