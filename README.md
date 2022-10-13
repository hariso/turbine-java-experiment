- [] Simple (read records from a source, write them to a destination)
- [] Record processing
- [] Multiple sources to multiple destinations --- not really a thing
- [] one to many
- [] explore joins


### App design
Split into:
* pipeline topology
* actual data processing


### Developer experience

* supported java versions?
* properties?
* maven artifact/gradle analogue 
* logging
  * goes to std out
* automatically add turbine-related metadata?

#### Fluent API
* looks nice for simpler topologies
* maybe not as useful for the ones where you need some logic to build the topology (is this a use case at all?)


### Questions
1. Why does process() need to be an exported/public method?