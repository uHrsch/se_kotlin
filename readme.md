# Kotlin
## Was ist Kotlin ?
Kotlin ist eine plattformübergreifende, statische Programmiersprache, die in Bytecode für die JVM übersetzt wird, aber auch in JS-Quellcode oder Maschinencode umgewandelt werden kann. Kotlin lässt sich ausßerdem zur Entwicklung von Android und iOS-Apps verwenden. 
Seit 2017 wird Kotlin offiziell von Google unterstützt und seit 2019 sogar bevorzugt. 
Hauptsächlich wird die Sprache von JetBrains entwickelt. 
## Wofür verwendet man Kotlin?
Da Kotlin die Möglichkeit bietet sowohl Android als auch iOS-Apps zu entwickeln lässt sich eine einmal erstellte App leicht für beide Systeme ausrollen. Da man weiter auch Webanwendungen mit Kotlin kann man einfach ein einheitliches Frontend entwickeln. Indem das Backend ebenfalls in Kotlin entwickelt werden kann ist es möglich das gesamte System in einer Programmiersprache abzubilden. 
Durch die Kompatibilität mit Java besteht die Chance bestehende Java Anwendungen mit Kotlin zu erweitern oder zu überarbeiten. 
## Syntax
Die Sprache ist syntaktisch nicht zu Java kompatibel. Trotzdem kann er mit Java-Code interoperieren. 
Anders als bei Java wird der Datentyp einer Variable nicht vor dem Varaiblennamen sondern danach, abgetrennt durch einen Doppelpunkt, notiert. Da Kotlin auch Typinferenz unterstützt, kann der Typ auch oft weggelassen werden, wenn er aus dem Zusammenhang klar ist. 
Ein weiterer Unterschied zu Java ist, dass der Zeilenumbruch als Anweisungsende genügt. Ein Semikolon wird nur benötigt, wenn eine Zeile aus mehreren Anweisungen besteht. 
Neben den member und function, die den Klassen und Methoden in Java entsprechen, wird von Kotlin zusätzlich prozeduale Programmierung unter Verwendung von Funktionen sowei bestimmte Aspekte der funktionalen Programmierung unterstützt. 
Ebenso wie in Java dient eine main-Funktion als Einstiegspunkt in das Programm. 

## Verwendung
- Multiplatform Mobile (Android und iOS apps)
- Server-side 
- Web Frontend
- Data Science

## Beispielcode
Vergleich der Hello World Programme in der Sprache Kotlin, Java und JavaScript
- Hello World Programm in Kotlin
```kotlin
fun main(){
    println("Hello World!")
}
```
- Hello World Programm in Java
```java
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
    }
}
```
- Hello World Programm in JS
```javascript
console.log("Hello World!")
```
# Einrichtung
## IDE 
Es gibt verschiedene mögliche IDEs zum Schreiben von Kotlin Programmen. 
Da Kotlin ebenfalls auf der JVM ausgeführt wird können die Java IDEs verwendet werden.
- Eclipse
- IntelliJ
- Android Studio
- Visual Studio Code
## Build-Tools / Frameworks
- Maven
- Gradle
- Spring 