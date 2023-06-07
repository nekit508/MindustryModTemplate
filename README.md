# Mindustry mod template

## Что это?
Шаблон для создания многомодульных джава модов для mindustry со сборщиком Gradle.

## Структура проекта
Проект содержит 4 модуля:
* annotations - АП для мода
* core - ядро мода, здесь пишется мультиплатформенный код
* android - часть мода связанная с мобильной версией
* desktop - часть мода связанная ПК версией

Каждый модуль по умолчанию содержит 3 директории, содержимое каждой встраивается в корень jar архива.:
* res - ресурсные файлы, аналог assets (спрайты, карты, звуки и тд)
* src - исходный код java
* gen - сгенерированный аннотационными процессорами код java



## Настройка
Перед использованием проекта его необходимо настроить.

Локальные настройки находятся в gitignore и не лежат в репозитории, поэтому их нужно создать вручную при каждом новом клонировании проекта.

### gradle.properties (обязательно)
Поля для настройки:
* version - версия мода, может содержать любые символы
* group - путь до вашего мода, используется для публикации исходного кода мода
* rootProjectName - название вашего мода, используется как префикс jar файлов

### version.properties (обязательно)
В РАЗРАБОТКЕ (НЕ ТРОГАТЬ)

### local.properties (локально)
Поля для настройки:
* useandroid - будет ли собраться мобильная версия мода, установите false если не собираетесь собирать мобильную версию локально, иначе true.
* sdkroot - путь до android sdk, требуется для настройки только, если useandroid установлен на true

### copy.properties (локально)
Файл для настройки мест копирования собранных jar файлов.

название подпроекта = места для копировния (перечисляются через ;)

Пример:
```properties
desktop = D:/games/mindustry/mods;D:/mods
android = D:/mods
```

Если вы используете русские символы в пути, убедитесь, что файл записан в кодировке UTF-8

### APA.properties и [subproject name]/APA.properties (локально)
Глобальные (для всех подпроектов) и локальные (для конкретного подпроекта) настройки аргументов для АП (аннотационных процессоров).

агрумент1 = значение1

Пример:
```properties
ProjectName = desktop
LoadsOutput = files.loads
```

## Сборка

```shell
./gradlew deploy
```

Для сборки одного подпроекта использовать:
```shell
./gradlew [subproject name]:cjar
```

По окончании сборки все выходные файлы окажутся в директории artifacts, а также в местах для копирования.
