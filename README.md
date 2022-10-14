### Examples
- [] Simple (read records from a source, write them to a destination)
- [] Record processing
- [] Multiple sources to multiple destinations --- not really a thing
- [] one to many
- [] explore joins (merge payloads of records with same keys, assuming they are structured)

### Principles and requirements
1. No separate types for sources and destinations
2. It's common to write to and read from the same resource
3. When reading, you must specify a "collection"
4. It should be possible to process all records being read from a source in the same way, 
i.e. attach a processor to a source
5. It should be possible to process all records being written to a destination in the same way, 
i.e. attach a processor to a destination.

### App design
Split into:
* pipeline topology
* actual data processing

### Developer experience

* supported java versions?
* how to configure the app?
* maven artifact/gradle analogue 
* logging
  * goes to std out
* automatically add turbine-related metadata?

#### Fluent API
* looks nice for simpler topologies
* maybe not as useful for the ones where you need some logic to build the topology (is this a use case at all?)

### Questions
1. Why does process() need to be an exported/public method?
2. Allow reading all collections from a resource (we're considering that an anti-pattern)?