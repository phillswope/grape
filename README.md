<img align="right" width="150" src="./doc/grapes.png"/>

# Grape
**Grape** is a syntax-aware `grep`-like utility for Clojure code. It allows one
to search for code patterns using Clojure structures.

NOTE: the API is very WIP for now.

## Command-Line Usage

FIXME
```
lein run <pattern> <file> [<file> ...]
```

## Library

```clojure
(require '[grape.core :as g])

;; Find all occurrences of map called with three arguments
(g/find-codes (slurp "myfile.clj") "(map $ $ $)")
```

## Patterns
A pattern is any valid Clojure expression. It can contain some special symbols
that are interpreted as wildcards.

### Wildcards
* `$`: any expression. `$` matches `42` and `(defn f [] 42)`. `(map $)` matches
       `(map inc)` but not `(map inc [1 2 3])`.

## License

Copyright © 2019 Baptiste Fontaine

This program and the accompanying materials are made available under the terms
of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published
by the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
