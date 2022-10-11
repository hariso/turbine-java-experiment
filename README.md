- [] Simple (read records from a source, write them to a destination)
- [] Record processing

### App design
Split into:
* pipeline topology
* actual data processing


### Developer experience

* supported java versions?
* properties?
* maven artifact/gradle analogue 
* logging 
* automatically add turbine-related metadata?

#### Fluent API
* looks nice for simpler topologies
* maybe not as useful for the ones where you need some logic to build the topology (is this a use case at all?)


### Questions
1. Why does process() need to be an exported/public method?