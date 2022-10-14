### Examples
- [ ] Simple (read records from a source, write them to a destination)
- [ ] Record processing
- [ ] Multiple sources to multiple destinations --- not really a thing
- [ ] one to many
- [ ] explore joins (merge payloads of records with same keys, assuming they are structured)

### Principles and requirements
1. No separate types for sources and destinations
2. It's common to write to and read from the same resource.
3. When reading, you must specify a "collection".


### App design
Split into:
* pipeline topology
* actual data processing

### Developer experience

* supported java versions?
  * likely Java 8 or 11, see: [this](https://www.infoworld.com/article/3652408/java-8-still-dominates-but-java-17-wave-is-coming-survey.html) 
  and [this](https://newrelic.com/resources/report/2022-state-of-java-ecosystem).
* how to configure the app?
* maven artifact/gradle analogue
* logging
  * goes to std out

#### Fluent API
* looks nice for simpler topologies
* maybe not as useful for the ones where you need some logic to build the topology (is this a use case at all?)
* Visualizes the pipeline
* Similar style used by some streaming frameworks: Java streams, RxJava, Flink, Kafka Streams.

### Questions
1. ~~Why does process() need to be an exported/public method?~~
2. Allow reading all collections from a resource (we're considering that an anti-pattern)?
3. Is it expected to write the same records to two destinations?
4. Is there any metadata we want to automatically add to all records (e.g. name of the turbine app and the version)?