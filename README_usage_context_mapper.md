# Usage of Context Mapper

首先按照官网 撸一遍 技术文档

## 1 introduce 

https://contextmapper.org/
ContextMapper is an open source project providing a Domain-specific Language and Tools for Strategic Domain-driven Design (DDD), Context Mapping, Bounded Context Modeling, and Service Decomposition.

### 1.1 Installation

* Visual Studio Code Marketplace: [Context Mapper](https://marketplace.visualstudio.com/items?itemName=contextmapper.context-mapper-vscode-extension)

* Eclipse Marketplace: [Context Mapper](https://marketplace.eclipse.org/content/context-mapper/)
Does not support all features we have in Eclipse yet. You can find a feature support table here.

Alternatively you can install the Eclipse plugin manually with the following update site URL: https://dl.bintray.com/contextmapper/context-mapping-dsl/updates/

### 1.2 Framework Architecture

``` plantuml
@startuml

!include puml/contextMapper01.puml
@enduml
```

## 2 Example

The following example gives you a first impression how CML context maps look like: [DDD Sample Application](https://github.com/citerus/dddsample-core)


### 2.1 Create CML Project
https://contextmapper.org/docs/getting-started-create-project/

### 2.2 sample project
https://github.com/ContextMapper/context-mapper-examples

### 2.3 CML Reference
https://contextmapper.org/docs/language-reference/

### 2.3.1 Strategic DDD Patterns
* [Context Map](https://contextmapper.org/docs/context-map/)
* [Bounded Context](https://contextmapper.org/docs/bounded-context/)
* [Subdomain (Core, Supporting, Generic)](https://contextmapper.org/docs/subdomain/)
* [Domain Vision Statement](https://contextmapper.org/docs/domain-vision-statement/)
* [Partnership (P)](https://contextmapper.org/docs/partnership/)
* [Shared Kernel (SK)](https://contextmapper.org/docs/shared-kernel/)
* [Customer/Supplier (C/S)](https://contextmapper.org/docs/customer-supplier/)
* [Open Host Service (OHS)](https://contextmapper.org/docs/open-host-service/)
* [Published Language (PL)](https://contextmapper.org/docs/published-language/)
* [Conformist (CF)](https://contextmapper.org/docs/conformist/)
* [Anticorruption Layer (ACL)](https://contextmapper.org/docs/anticorruption-layer/)
* [Responsibility Layers](https://contextmapper.org/docs/responsibility-layers/)
* [Knowledge Level](https://contextmapper.org/docs/knowledge-level/)

### 2.3.2 Tactic DDD Patterns

https://contextmapper.org/docs/tactic-ddd/
https://contextmapper.org/docs/aggregate/

* Module
* Aggregate (and Aggregate Root)
* Entity
* Service
* Value Object
* Domain Event

### 2.3.3 Additional Language Features

* [User Requirements](https://contextmapper.org/docs/user-requirements/)
* [Imports](https://contextmapper.org/docs/imports/)
