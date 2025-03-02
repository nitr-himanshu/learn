# Kotlin : Data types

- [Kotlin : Data types](#kotlin--data-types)
  - [Integer](#integer)
  - [Byte](#byte)
  - [Short](#short)
  - [Long](#long)
  - [Unsigned Integer](#unsigned-integer)
  - [Unsigned Byte](#unsigned-byte)
  - [Unsigned Short](#unsigned-short)
  - [Unsigned Long](#unsigned-long)
  - [Double](#double)
  - [Float](#float)
  - [char](#char)
  - [string](#string)
    - [concatenation](#concatenation)
    - [string template](#string-template)
    - [raw string](#raw-string)
    - [string methods](#string-methods)
  - [nullable type](#nullable-type)
    - [elvis operator](#elvis-operator)
  - [Conversion](#conversion)
  - [Key point](#key-point)

## Integer

```kotlin
val aInt: Int = 0
val bInt = 0
```

- 32-bit (4 Byte)

## Byte

```kotlin
val aByte: Byte  = 0
```

- 8-bit

## Short

```kotlin
val aShort: Short  = 0
```

- 16-bit

## Long

```kotlin
val aLong: Long  = 0
val inferredLong = 100000000000000000
val inferredLong2 = 10L
```

- 64-bit

## Unsigned Integer

```kotlin
val aUInt: UInt = 0
val bUInt = 0U
```

- 32-bit (4 Byte)

## Unsigned Byte

```kotlin
val aUByte: UByte  = 0
```

- 8-bit

## Unsigned Short

```kotlin
val aUShort: UShort  = 0
```

- 16-bit

## Unsigned Long

```kotlin
val aULong: Long  = 0
val inferredLong = 10UL
```

- 64-bit

## Double

```kotlin
val aDouble: Double  = 5.5
val inferredDouble = 6.6
```

- 64-bit

## Float

```kotlin
val aFloat: Float  = 5.5
val inferredFloat = 6.6f
```

- 32-bit

## char

```kotlin
val aChar: Char  = 'a'
val inferredChar = '1'
```

- single quote
- Cannot be concatenate

## string

```kotlin
val aString: String  = "Hello Kotlin!"
val inferredString = "New string"
val escapedString: String = "Hello \n World!"
```

- double quote
- strings are immutable

### concatenation

```kotlin
val aString: String  = "Hello" + "Kotlin"
```

- we can use + operator.
- It will create a new string object

### string template

```kotlin
val aNumber = 10
val concatTemplate = ""The number $aNumber""
val concatTemplate = ""The number ${1 + aNumber}""
```

- Helps into putting values in a string.

### raw string
  
```kotlin
val aRawString = """
 THis   is 
      a    raw   
        string
"""
```

- triple quote
- we can trim a raw string using **trimMargin([marginPrefix])**
- Default trimming character is | (pipe)

```kotlin
val aRawString = """
 THis   is 
      |a    raw   
        string
              |with trim
"""
raw.trimMargin()
```

```kotlin
val aRawString = """
 THis   is 
      >>a    raw   
        string
              >>with trim
"""
raw.trimMargin(">>")
```

### string methods

- isNotEmpty()
- isEmpty()
- isNotBlank()
- isBlank()
- contains(\<pattern>)

## nullable type

```kotlin
val aNullableString: String? = null
println(aNullableString?.length) //return null object
```

- using ? with data type

### elvis operator

```kotlin
val aNullableString: String? = null
println(aNullableString?.length ?: "the value was null") //return message
```

- ?:

## Conversion

- toInt( )
- toFloat( )
- toULong( )
- toByte( )

## Key point

- We can represent like this also 100_000_000. Consider _ (underscore) as comma.
