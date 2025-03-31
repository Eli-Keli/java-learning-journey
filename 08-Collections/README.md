# Java Collections - Day 8
## Topics Covered:
- Introduction to Java Collections Framework
- Lists (`ArrayList`) Ordered collection with duplicates
- Sets (`HashSet`) Unordered collection with unique elements
- Maps (`HashMap`) Key-value pairs for fast lookups

## Challenges:
- (None)
## Takeaways:
**What is the Java Collections Framework?** The Java Collections Framework (JCF) is a set of classes and interfaces that handle groups of objects efficiently.

Collections eliminate the need for arrays (which have a fixed size)..

| Collection Type | Description                          | Example   |
|------------------|--------------------------------------|-----------|
| List             | Ordered collection, allows duplicates | `ArrayList` |
| Set              | Unordered, does NOT allow duplicates | `HashSet`   |
| Map              | Stores key-value pairs              | `HashMap`   |



**Lists (`ArrayList`)** 

A List is an ordered collection that allows duplicates.
`ArrayList` is the most commonly used List implementation.

*Key Points:*
- Use `ArrayList` when order matters and duplicates are allowed.
- `add()`, `remove()`, `get()`, `size()`, `contains()` are common methods.

**Sets (`HashSet`)** 

A Set is an unordered collection that does NOT allow duplicates.
`HashSet` is one of the most used Set implementations.

*Key Points:*
- Use `HashSet` when uniqueness matters and order does NOT matter.
- `add()`, `remove()`, `contains()`, `size()` are common methods.

**Maps (`HashMap`)** 

A Map stores key-value pairs, like a dictionary.
`HashMap` is one of the most used Map implementations.

*Key Points:*
- Use `HashMap` when fast lookups are needed using a key.
- `put()`, `get()`, `keySet()`, `containsKey()`, `size()` are common methods.

