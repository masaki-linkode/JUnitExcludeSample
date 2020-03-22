## 通常テストだけを行う

```
$ mvn surefire:test@default-test
```

## 除外テストだけを行う

```
$ mvn surefire:test@exclude-test -DskipExcludeTest=false
```