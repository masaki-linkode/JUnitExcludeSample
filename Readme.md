


## 通常テストだけを行う

```
$ mvn surefire:test@default-test
```

または

```
$ mvn test
```

## 除外テストだけを行う

```
$ mvn surefire:test@exclude-test -DskipExcludeTest=false
```

## 通常テストも除外テストも行う

```
$ mvn test -DskipExcludeTest=false
```