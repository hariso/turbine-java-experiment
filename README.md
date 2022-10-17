### Principles and requirements
1. No separate types for sources and destinations
2. It's common to write to and read from the same resource.
3. When reading, you must specify a "collection".
4. A chaining API is used.
   1. Visualizes the pipeline better.
   2. Similar style used by some streaming frameworks: Java streams, RxJava, Flink, Kafka Streams.

### Examples
To see how the API is used in different use cases, the following examples are available 
in the [examples](/src/main/java/com/meroxa/turbine/fluent/examples) directory:
* Simple (read records from a source, write them to a destination)
* Simple with processing
* ~~Multiple sources to multiple destinations~~ -- not really a thing
* One source, many destination, with record processing

### To be done
- [ ] Explore joins (merge payloads of records with same keys, assuming they are structured)
- [ ] How to configure the app?
- [ ] Provide Maven archetype
- [ ] Provide guidelines for logging
- [ ] Decide which Java versions should be supported, likely Java 8 or 11, see: 
[this](https://www.infoworld.com/article/3652408/java-8-still-dominates-but-java-17-wave-is-coming-survey.html) 
and [this](https://newrelic.com/resources/report/2022-state-of-java-ecosystem).

### Questions
1. ~~Why does process() need to be an exported/public method?~~
2. Should we allow reading all collections from a resource? We're considering that an anti-pattern and discourage that,
so should we make it impossible?
    * Answer: no, we shouldn't be allowing that, for two reasons:
    * Implicitly, tables are mapped to topics, but the issue is that we cannot predict what the topic name will be.
    * Different collections (tables, buckets, etc.) mean different types, so a 
3. Is there any metadata we want to automatically add to all records (e.g. name of the turbine app and the version)?
    * Sensible idea, but not a must-have for now. 