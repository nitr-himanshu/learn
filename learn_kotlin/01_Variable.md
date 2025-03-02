# Kotlin : Variables

- [Kotlin : Variables](#kotlin--variables)
  - [Syntax](#syntax)
  - [Val](#val)
  - [Var](#var)
  - [Key points](#key-points)

## Syntax

```kotlin
val/var \<variable name\>: \<Data type\> = \<value>
```

*Type inference*  
Compiler decide data type based on value assigned.

```kotlin
val/var \<variable name> = \<value>
```

## Val

- Val is a keyword denoting readonly variable.
- Values can't be changed
- Immutable values

## Var

- Mutable values
- Values can be changed.

```kotlin
fun main() {
    val immutableBool: Boolean = true
    println(immutableBool)
//    immutableBool = false    // Error

    var mutableBool: Boolean = true
    println(mutableBool)
    mutableBool = false
    println(mutableBool)

    var typeInferBool = true
    println(typeInferBool)
}
```

## Key points

- Kotlin favour immutability by default.
